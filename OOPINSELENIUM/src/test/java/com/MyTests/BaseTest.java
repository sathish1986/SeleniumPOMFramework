package com.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mybase.BasePage;
import com.mybase.MyPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public MyPage mypage;
	
	@BeforeMethod
	@Parameters (value={"browser"})
	public void setUpTest(String browser) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			}
		else {
			System.out.println("no browser is defined in testng.xml file");
		}
		
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(6000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		mypage = new BasePage(driver);
		
	}
	
	@AfterMethod
	public void setDown() {
		driver.close();
	}

}
