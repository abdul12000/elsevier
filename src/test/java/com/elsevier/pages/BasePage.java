package com.elsevier.pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BasePage {
		WebDriverWait wait;
		public BasePage(WebDriver driver){
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver,10);
		}
		
		/**
		 * Common explicit wait methods;
		 */
		
		public void waitForVisibilityOfElement(WebElement element){
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
	
		public void waitForClickabilityOfElement(WebElement element){
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		/**
		 * Common interaction methods;
		 */
		
		public void sendKeys(WebElement element, String keyword){
			waitForVisibilityOfElement(element);
			element.clear();
			element.sendKeys(keyword);
		}
		public void submit(WebElement element){
			waitForVisibilityOfElement(element);
			element.submit();;
		}
		
		public void click(WebElement element){
			waitForVisibilityOfElement(element);
			element.click();
		}
		
		public void selectFromDropDown(WebElement element, int index){
			waitForVisibilityOfElement(element);
			Select sfos = new Select(element);
			sfos.selectByIndex(index);
		}

	}

