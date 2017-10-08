package com.elsevier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Create account")
	public WebElement lnk_create_acccount;

	public void click_create_account_link() {
		click(lnk_create_acccount);
	}

}
