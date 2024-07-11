package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePageFree extends TestBase{
	
	//Page factory OR Object repository
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	WebElement dashboard;
		
	@FindBy(partialLinkText="Opdrachten")
	WebElement assignmentsLink;
		
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")
	WebElement storeTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	WebElement communityTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	WebElement entrepreneurTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")
	WebElement BusinessesTab;
	
	@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
	WebElement signOutLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
	WebElement signOutBtn;
	
		
	//Initialization
	public HomePageFree() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public void clickDashboardTab() {
		dashboard.click();
	}
		
	public AssignmentsPageFree clickAssignmentsLink() {
		assignmentsLink.click();
		return new AssignmentsPageFree();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	
	public StorePageFree clickStoreTab() {
		storeTab.click();
		return new StorePageFree();
	}
	
	public CommunityPageFree clickCommunityTab() {
		communityTab.click();
		return new CommunityPageFree();
	}
	
	public EntrepreneursPageFree clickEntrepreneurTab() {
		entrepreneurTab.click();
		return new EntrepreneursPageFree();
	}
	
	public void clickBusinessesTab() {
		BusinessesTab.click();
	}
		
	public void clickSignOutLink() {
		signOutLink.click();
	}
	
	public void clickSignOutBtn() {
		signOutBtn.click();
	}

}
