package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CommunityPageAdmin;
import com.crm.qa.pages.CommunityPageFree;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import com.crm.qa.pages.MyNetworkPageFree;


public class CommunityPageAdminTest extends TestBase{

	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	CommunityPageFree communityPageFree;
	CommunityPageAdmin communityPageAdmin;
	MyNetworkPageFree myNetworkPageFree;
	TestUtil testUtil;
	
	public CommunityPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		communityPageFree=new CommunityPageFree();
		communityPageAdmin=new CommunityPageAdmin();
		myNetworkPageFree=new MyNetworkPageFree();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickCommunityPageAdmin();
		testUtil.testWaitEight();
						
	}
	
	@Test
	public void community() throws Exception{
		myNetworkPageFree.clickSeachValue();
		testUtil.testWaitTwo();
		myNetworkPageFree.enterSearchValue("Hr");
		testUtil.testWaitFour();
		myNetworkPageFree.clickCancelSearch();
		testUtil.testWaitFour();
		//Type of Message
		/*myNetworkPageFree.clickTypeMessageDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.selectTypeMessage();
		testUtil.testWaitFour();
		myNetworkPageFree.selectTypeMessage();
		testUtil.testWaitFour();
		myNetworkPageFree.clickTypeMessageDropDown();
		testUtil.testWaitTwo();
		//Area of Interest
		myNetworkPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		myNetworkPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		myNetworkPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		//Sector
		myNetworkPageFree.clickSectorDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.selectSector();
		testUtil.testWaitFour();
		myNetworkPageFree.selectSector();
		testUtil.testWaitFour();
		myNetworkPageFree.clickSectorDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.clickEveryOneDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.selectEveryOneMyOwnNetwork();
		testUtil.testWaitFour();
		myNetworkPageFree.selectEveryOneEveryOne();
		testUtil.testWaitFour();
		myNetworkPageFree.clickEveryOneDropDown();
		testUtil.testWaitTwo();
		myNetworkPageFree.clickFavoiritesPosts();
		testUtil.testWaitFour();
		myNetworkPageFree.clickFavoiritesPosts();
		testUtil.testWaitFour();
		//MyNetwork
		myNetworkPageFree.clickMyNetworkBtn();
		testUtil.testWaitEight();
		myNetworkPageFree.clickMyNetworkTab();
		testUtil.testWaitFour();
		myNetworkPageFree.clickMyRequestsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myNetworkPageFree.clickSuggestionsForYouTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myNetworkPageFree.clickAreaOfInterest();
		testUtil.testWaitFour();*/
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitEight();
		
				
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}
}
