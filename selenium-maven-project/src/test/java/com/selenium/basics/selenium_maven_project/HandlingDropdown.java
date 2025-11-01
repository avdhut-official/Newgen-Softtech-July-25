package com.selenium.basics.selenium_maven_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown_country= chrome_driver.findElement(By.id("country"));
		Select sel_country=new Select(dropdown_country);
		
		//selecting a value from dropdown
		Thread.sleep(2000);
		sel_country.selectByVisibleText("Canada");
		Thread.sleep(2000);
		sel_country.selectByValue("uk");
		Thread.sleep(2000);
		sel_country.selectByIndex(9);
		Thread.sleep(2000);
		sel_country.selectByContainsVisibleText("Aus");
		
		//displaying all dropdown values including count
		List<WebElement> all_option = sel_country.getOptions();
		System.out.println("Counties Avaialble : "+all_option.size());
		
		//Displaying Names of countries
		for(WebElement each_country:all_option)
		{
			System.out.println(each_country.getText());
		}
		
	}
}






