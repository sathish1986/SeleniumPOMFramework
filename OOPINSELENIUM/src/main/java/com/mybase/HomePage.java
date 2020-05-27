package com.mybase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	private By HomeHeader = By.className("private__title");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement getHomeHeader() {
		return getElement(HomeHeader);
	}

	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		 return getPageHeader(HomeHeader);
	}
	
}
