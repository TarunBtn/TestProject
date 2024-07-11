package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePageAdmin extends TestBase{

	//Page factory OR Object repository
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/span")
	WebElement assignmentsTab;
		
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	WebElement communityTab;
		
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	WebElement matchTab;
		
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
		
	@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
	WebElement signOutLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
	WebElement signOutBtn;
	
	//Initialization
	public HomePageAdmin() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public AssignmentsPageAdmin clickAssignmentsTab() {
		assignmentsTab.click();
		
		return new AssignmentsPageAdmin();
	}
		
	public CommunityPageAdmin clickCommunityPageAdmin() {
		communityTab.click();
		
		return new CommunityPageAdmin();
	}
		
	public MatchPageAdmin clickMatchTab() {
		matchTab.click();
			
		return new MatchPageAdmin();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	
	public void clickSignOutLink() {
		signOutLink.click();
	}
	
	public void clickSignOutBtn() {
		signOutBtn.click();
	}
	
}
