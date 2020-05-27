/**
 * 
 */
package com.mybase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author sathish
 *
 */
public class LoginPage extends BasePage {

	private By emailID= By.id("username");
	private By password= By.id("password");
	private By loginButton= By.id("loginBtn");
	private By loginHeader= By.xpath("//*[data-key='login.signupLink.text']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmailID() {
		return getElement(emailID);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}


	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(loginHeader);
	}
	
	public HomePage doLogin(String username, String password) {
		getEmailID().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		return getInstance(HomePage.class);
		
	}
	public void doLogin() {
		getEmailID().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
	}
	
	//username: sathish@gmail.com
	//password: password1

	public void doLogin(String userCred) {
		if(userCred.contains("username")) {
			getEmailID().sendKeys(userCred.split(":")[1].trim());
		} else if (userCred.contains("password")) {
			getPassword().sendKeys(userCred.split(":")[1].trim());
		}
		
		
	}

	

}
