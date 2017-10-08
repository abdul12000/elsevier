package com.elsevier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Feedpage extends BasePage {
	public Feedpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Feed")
	private WebElement txtFeed;

	public void waitForVisibilityOfFeedPage() {
		waitForVisibilityOfElement(txtFeed);
	}

}
