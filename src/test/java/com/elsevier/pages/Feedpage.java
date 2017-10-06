package com.elsevier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Feedpage extends BasePage{
	public Feedpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Feed")
	public WebElement txtFeed;
	
	
	
	public void waitForVisibilityOfFeedPage(){
		waitForVisibilityOfElement(txtFeed);
	}
	
	

}
