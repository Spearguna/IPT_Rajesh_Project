package org.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_Class {
	public WebDriver driver;
	
	public void browerLaunch(String url) {		
		driver.get(url);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void inputValues(WebElement element, String input) {
		element.sendKeys(input);
	}
	

}
