package com.MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParallelExecution {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void test1(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish\\Desktop\\REST_API\\chromedriver.exe");

		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		
		driver.get("http://www.lean-automation.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	


}
