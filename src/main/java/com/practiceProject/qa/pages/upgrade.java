package com.practiceProject.qa.pages;

import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.practiceProject.qa.utility.utility;

public class upgrade extends utility {
	static WebDriver driver;
	
	@FindBy(xpath="//div[text()='MORE']") private WebElement MORE_dropdown;
	@FindBy(xpath="//ul[contains(@class,'Desktop_main__rightSection__sideBarConfig__')]/li[1]") private WebElement career_link;
	@FindBy(id="link-tl6qjxhr6p") private WebElement explore_open_position_link;
//	@FindBy(xpath="//div[text()='HR Management'][1]") private WebElement course_button;
//	@FindBy(xpath="//div[text()='HR Management'][1]") private WebElement course_button;
//	@FindBy(xpath="//div[text()='HR Management'][1]") private WebElement course_button;


	public void click_MORE_dropdown(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(MORE_dropdown);
	}
	
	public void career_link() {
		career_link.click();
	}
	
	public void explore_careeroption() {
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> itr = windowID.iterator();
		itr.next();
		String second = itr.next();
		driver.switchTo().window(second);
		explore_open_position_link.click();
	}
	
	
	
	
	
	
	
}
