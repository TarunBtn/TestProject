package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AssignmentsPageAdmin;
import com.crm.qa.pages.AssignmentsPageFree;
import com.crm.qa.pages.HomePageAdmin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class AssignmentsPageAdminTest extends TestBase{
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageFree assignmentsPageFree;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public AssignmentsPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageFree=new AssignmentsPageFree();
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitEight();
		assignmentsPageFree.enterAssignmentsName("QA EngineerEight");
		testUtil.testWaitFour();
		assignmentsPageFree.selectAssignmentsValue();
		testUtil.testWaitFour();
		assignmentsPageFree.clearAssignmentsFilter();
		testUtil.testWaitFour();
		//Sector
		/*assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkillValue();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickClearFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitTwo();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		//Work & Thinking level
        assignmentsPageFree.clickWorkAndThinkingLevel();
        testUtil.testWaitTwo();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
	    testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
	    testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();*/
		
		
		
				
	}
	
	@Test
	public void assignmentsPage() {		
		
	}
	
	@AfterMethod
	public void tearDown(){
		//Driver.quit();
	}

}
