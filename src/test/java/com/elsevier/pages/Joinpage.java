package com.elsevier.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Joinpage extends BasePage {

	public Joinpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email")
	private WebElement inpEmail;

	@FindBy(id = "first_name")
	private WebElement inpFirstname;

	@FindBy(id = "last_name")
	private WebElement inpLastname;

	@FindBy(id = "password")
	private WebElement inpPassword;

	@FindBy(className = "first-step-button")
	private WebElement btnContinue;

	@FindBy(id = "subject_area")
	private WebElement selFieldOfStudy;

	@FindBy(id = "user_role")
	private WebElement selAcademicStatus;

	@FindBy(id = "join-form-submit")
	private WebElement btnCreatAccount;

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
