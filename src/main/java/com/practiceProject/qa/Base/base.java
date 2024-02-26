package com.practiceProject.qa.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class base {
	
	static WebDriver driver;
	
	public static void crossBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\OneDrive\\Desktop\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\OneDrive\\Desktop\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
		}else {
			System.out.println("please select correct browser");
		}
		
		driver.get("https://www.upgrad.com/");
		driver.manage().window().maximize();
		
	}	
	
}
