package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page factory or Object Repository
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/a/img")
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[1]/a/img[1]")
	WebElement imageLogo;
	
	@FindBy(xpath="//a[@class='nav-link'][normalize-space()='Mijn opdrachten']")
	WebElement myAssignmentsLink;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	WebElement dashboardLink;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	WebElement matchLink;
	
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
	WebElement signOutLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
	WebElement signOutBtn;
	
	//Initialization
	public HomePage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public String verifyHomePageTitle() {
		return Driver.getTitle();
	}
	
	public boolean verifyImageLogo() {
		return imageLogo.isDisplayed();
	}
	
	public HomePageFree clickMatchLink() {
		matchLink.click();
		return new HomePageFree();
	}
	
	public MyAssignmentsPage clickMyAssignmentsLink()throws Exception {
		myAssignmentsLink.click();
		Thread.sleep(8000);
		return new MyAssignmentsPage();
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
