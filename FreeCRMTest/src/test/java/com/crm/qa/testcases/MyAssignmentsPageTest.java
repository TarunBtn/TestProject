package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCommandPage;
import com.crm.qa.pages.CheckCommandPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;

public class MyAssignmentsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	//CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();	
		testUtil=new TestUtil();		
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEight();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEight();
		//checkCommandPage=new CheckCommandPage();		
													
	}
	
	@Test(priority=1)
	public void myAssignmentsPageTest()throws Exception {
		myAssignmentsPage.enterValueInFilter();
		testUtil.testWaitFour();
		myAssignmentsPage.clickResetFilter();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectCompany();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
