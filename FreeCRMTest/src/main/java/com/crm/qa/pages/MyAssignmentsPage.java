package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MyAssignmentsPage extends TestBase{
	
	//Page factory or Object Repository
	@FindBy(xpath="//a[@class='btn btn-gold mt-4 btn-position']")
	WebElement addNewCommand;
	
	@FindBy(id="filter-input")
	WebElement filter;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement resetFilter;
	
	@FindBy(id="initial-sort-select")
	WebElement chooseCompanyDropDown;
	
	@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[3]")
	WebElement selectCompanyFromDropDown;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[1]")
	WebElement ownerDropDown;
	
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[3]/ul/li[2]/span")
	WebElement selectOwnerFromDropDown;
	
	@FindBy(xpath="//div[@class='ml-auto my-1 col-lg-3']//select[@id='initial-sort-select']")
	WebElement statusDropDown;
	
	@FindBy(xpath="//option[@value='Open']")
	WebElement selectStatusFromDropDown;
	
	
	
	//Initialization
	public MyAssignmentsPage() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void enterValueInFilter() {
		filter.sendKeys("Test");
	}
	
	public void clickResetFilter() {
		resetFilter.click();
	}
	
	public void clickChooseCompanyDropDown() {
		chooseCompanyDropDown.click();		
	}
	
	public void selectCompany() {
		selectCompanyFromDropDown.click();
	}
	
	public void selectOwner() {
		ownerDropDown.click();
		selectOwnerFromDropDown.click();
	}
	
	public void StatusDropDown() {
		statusDropDown.click();	
	}
	
	public void selectStatusFromDropDown() {
		selectStatusFromDropDown.click();
	}
	
	public AddCommandPage clickAddNewCommand() {
		addNewCommand.click();
		return new AddCommandPage();
	}

}
