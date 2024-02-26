package com.practiceProject.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practiceProject.qa.Base.base;
import com.practiceProject.qa.pages.upgrade;

public class upgradeTests extends base {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		base.crossBrowser("chrome");
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	@Test
	public void execute_script() {
		upgrade up = new upgrade();
		up.click_MORE_dropdown(driver);
		up.career_link();
		up.explore_careeroption();
	}
	
	
	

}
