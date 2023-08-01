package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class MatchPageAdmin extends TestBase{
	//Page factory or Object repository
	@FindBy(id="filter-search-input")
	WebElement valueFilter;
	
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div/span")
	WebElement clickCancel;
	
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[1]")
	WebElement clickAssignmentDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-assignment\"]/div/div[3]/ul/li[7]/span/span")
	WebElement selectAssignmentValue;

}
