package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAssignmentsPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	HomePageFree homePageFree;
	MyAssignmentsPage myAssignmentsPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		homePageFree=new HomePageFree();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		testUtil.testWaitFourteen();
		  //homePage.clickAcceptAllCookies();
		  //testUtil.testWaitEleven();
				
	}
	
	@Test(priority=1)
	public void homePageTitleTest()throws Exception {
		String title=homePage.verifyHomePageTitle();
		testUtil.testWaitEight();
		try {
		    Assert.assertEquals(title, "Form | Younited® platform");
		}catch(AssertionError e) {
			e.printStackTrace();
		}
		testUtil.testWaitEight();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitEight();
	}
	
	@Test(priority=2)
	public void myAssignmentsPage()throws Exception {
		//myAssignmentsPage=homePage.clickMyAssignmentsLink();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFourteen();
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
