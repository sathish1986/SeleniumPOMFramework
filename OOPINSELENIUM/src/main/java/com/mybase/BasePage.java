package com.mybase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends MyPage{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageHeader(By locator) {
		 return getElement(locator).getText();
		
	}

	@Override
	public WebElement getElement(By locator) {
	 
		WebElement element = null;
		try {
			waitForELementToPresent(locator);
			element = driver.findElement(locator);
			return element;	
		}catch(Exception e) {
			System.out.println("Some error occured while creating eleemnt" +locator.toString());
			e.printStackTrace();
		}
		return element;
		
	}

	@Override
	public void waitForELementToPresent(By locator) {
		 try {
			 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		 } catch(Exception e) {
			 System.out.println("Some exception occured while wating for element" +locator.toString());
		 }
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			 wait.until(ExpectedConditions.titleContains(title));
		 } catch(Exception e) {
			 System.out.println("Some exception occured while wating for element" +title.toString());
		 }
		
	}
	
	

}
