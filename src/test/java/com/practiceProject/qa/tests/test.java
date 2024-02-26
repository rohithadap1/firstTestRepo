package com.practiceProject.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class test {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\OneDrive\\Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement click_nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
		click_nextButton.click();
		
		Thread.sleep(2000);
		
		WebElement name_errorMSG = driver.findElement(By.xpath("//span[text()='Enter first and last names']"));
		String actual_error=name_errorMSG.getText();
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_error, "Enter first and last names");
		soft.assertAll();
		
		
	}

}
