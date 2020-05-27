package com.mybase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class MyPage {

	WebDriver driver;
	WebDriverWait wait;
	
		public MyPage(WebDriver driver){
			this.driver=driver;
			this.wait=new WebDriverWait(this.driver,15);
		}
		
		//Abstract methods
		
		public abstract String getPageTitle();
		
		abstract String getPageHeader(By locator);
		
		public abstract WebElement getElement(By locator);
		
		public abstract void waitForELementToPresent(By locator);

		public abstract void waitForPageTitle(String title);
		
		public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> myPageClass) {
			
			try {
				return myPageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
			} catch(Exception e) {
				e.printStackTrace();
				return null;
			} 
		}
		
	}


