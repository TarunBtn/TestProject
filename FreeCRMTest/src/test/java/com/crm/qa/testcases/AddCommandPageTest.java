package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCommandPage;
import com.crm.qa.pages.CheckCommandPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;

public class AddCommandPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public AddCommandPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFour();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitFour();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void uploadFileTest()throws Exception {
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitFour();
		checkCommandPage=addCommandPage.clickUploadFile();
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
