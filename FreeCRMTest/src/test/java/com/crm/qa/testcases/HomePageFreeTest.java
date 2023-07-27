package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AssignmentsPageFree;
import com.crm.qa.pages.HomePageFree;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageFreeTest extends TestBase{
	
	LoginPage loginPage;
	HomePageFree homePageFree;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public HomePageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		assignmentsPageFree=new AssignmentsPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEight();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
				
	}
	
	@Test
	public void clickAssignmentLinkTest()throws Exception {
		//testUtil.testWaitEight();
		assignmentsPageFree=homePageFree.clickAssignmentsLink();
		testUtil.testWaitFour();
			
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}
	

}
