package com.elsevier.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.elsevier.base.BaseUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{
	
	private BaseUtil base;
	public Hook(BaseUtil base){
		this.base = base;
	}

	
	@Before
	public void setup(){
		String chromedriverLocation= "src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverLocation);
		base.Driver= new ChromeDriver();
	}
	
	@After
	public void cleanup() throws InterruptedException{
		Thread.sleep(3000);
		base.Driver.quit();
		
	}
	
}
