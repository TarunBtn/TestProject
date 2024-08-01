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
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testUtil.testWaitFourteen();
		  //homePage.clickAcceptAllCookies();
		  //testUtil.testWaitEleven();		
		homePage.clickMyAssignmentsLink();
		//testUtil.testWaitEleven();
		  //testUtil.testWaitEight();
		  //checkCommandPage=new CheckCommandPage();
		testUtil.scrollDown();
		//testUtil.testWaitTwo();
		testUtil.scrollUp();
		//testUtil.testWaitTwo();
													
	}
	
	@Test
	public void myAssignmentsPageTest()throws Exception {
		myAssignmentsPage.enterValueInFilter("Test");
		//testUtil.testWaitEleven();
		myAssignmentsPage.clickResetFilter();
		//testUtil.testWaitEleven();
		myAssignmentsPage.clickChooseCompanyDropDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.selectCompanyFromDropDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		//testUtil.testWaitTwo();
		testUtil.scrollDown();
		//testUtil.testWaitTwo();
		testUtil.scrollUp();
		//testUtil.testWaitTwo();
		myAssignmentsPage.clickStatusDropDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDownOpen();
		//testUtil.testWaitEight();
		  //myAssignmentsPage.StatusDropDown();
		  //testUtil.testWaitFour();
		  //myAssignmentsPage.selectStatusFromDropDownClosed();
		  //testUtil.testWaitFour();
		myAssignmentsPage.clickStatusDropDown();
		//testUtil.testWaitTwo();
		testUtil.scrollDown();
		//testUtil.testWaitTwo();
		testUtil.scrollUp();
		//testUtil.testWaitTwo();
		myAssignmentsPage.clickStatusDropDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.clearStatusFromDropDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.clickStatusDropDown();
		//testUtil.testWaitTwo();
		homePage.clickSignOutLink();
		//testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		//testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
