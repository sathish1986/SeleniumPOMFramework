package com.MyTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mybase.HomePage;
import com.mybase.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority =1)
	 public void verifiyLoginTitleTest() {
		//LoginPage loginpage =new LoginPage();
		  // or below generic class
		String logintitle= mypage.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(logintitle);
		Assert.assertEquals(logintitle, "HubSpot Login");
	}
	
	@Test(priority =2)
	
	public void verifyLoginHeader() {
		String header1=mypage.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header1);
		Assert.assertEquals(header1, "Don't have an account?");
		
	}
	
	@Test(priority =3)
	public void doLoginTest() {
		HomePage homepage= mypage.getInstance(LoginPage.class).doLogin("Sathish","password1");
	String homeheader=homepage.getHomePageHeader();
	System.out.println(homeheader);
	Assert.assertEquals(homeheader, "Getting started with HubSpot");
	}
	
	
	
	

}
