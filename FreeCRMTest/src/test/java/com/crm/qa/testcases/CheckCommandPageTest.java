package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCommandPage;
import com.crm.qa.pages.CheckCommandPage;
import com.crm.qa.pages.CompleteAssignment;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;

public class CheckCommandPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	
	public CheckCommandPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEight();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFour();
		myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitFour();
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("C:\\chromedriver\\Assignment.docx");
		testUtil.testWaitFour();
		addCommandPage.clickUploadFile();
		testUtil.testWaitFour();
							
	}
	
	@Test
	public void checkCommandPageTest()throws Exception {
		completeAssignment=checkCommandPage.clickFillInComplete();
		testUtil.testWaitFour();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
}
