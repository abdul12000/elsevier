package com.elsevier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Joinpage extends BasePage {

	public Joinpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email")
	public WebElement inpEmail;

	@FindBy(id = "first_name")
	public WebElement inpFirstname;

	@FindBy(id = "last_name")
	public WebElement inpLastname;

	@FindBy(id = "password")
	public WebElement inpPassword;

	@FindBy(className = "first-step-button")
	public WebElement btnContinue;

	@FindBy(id = "subject_area")
	public WebElement selFieldOfStudy;

	@FindBy(id = "user_role")
	public WebElement selAcademicStatus;

	@FindBy(id = "join-form-submit")
	public WebElement btnCreatAccount;

	public void enterEmail(String email) {
		sendKeys(inpEmail, email);
	}

	public void enterFirstname(String firstname) {
		sendKeys(inpFirstname, firstname);
	}

	public void enterLastname(String lastname) {
		sendKeys(inpLastname, lastname);
	}

	public void enterPassword(String password) {
		sendKeys(inpPassword, password);
	}

	public void clickContinueButton() {
		submit(btnContinue);
	}

	public void selectFieldOfStudy() {
		selectFromDropDown(selFieldOfStudy, 3);
	}

	public void selectAcademicStatus() {
		selectFromDropDown(selAcademicStatus, 2);
	}

	public void clickCreatAccountButton() {
		submit(btnCreatAccount);
	}

}
