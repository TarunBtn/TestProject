package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()throws Exception {
		String title=loginPage.validateLoginPageTitle();
		testUtil.testWaitFour();
		Assert.assertEquals(title, "Log in | Younited® platform");
		testUtil.testWaitFour();
	}
	
	@Test(priority=2)
	public void imageLogoTest()throws Exception {
		boolean flag=loginPage.validateImageLogo();
		testUtil.testWaitFour();
		Assert.assertTrue(flag);
		testUtil.testWaitFour();
	}
	
	@Test(priority=3)
	public void loginTest()throws Exception {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}
	
}
