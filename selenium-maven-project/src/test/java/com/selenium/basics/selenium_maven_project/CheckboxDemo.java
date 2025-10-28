package com.selenium.basics.selenium_maven_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.get("https://testautomationpractice.blogspot.com/");
		chrome_driver.manage().window().maximize();
		
		//locating the checkbox
		
		/*
		WebElement check_day= chrome_driver.findElement(By.id("sunday"));
		System.out.println(check_day.getAttribute("value"));
		System.out.println("Displayed - "+check_day.isDisplayed());  //true or false - when its displayed on web application
		System.out.println("Enabled - "+check_day.isEnabled());   //true or false - when its editable / modifiable
		System.out.println("Selected 1- "+check_day.isSelected());
		check_day.click();
		System.out.println("Selected 2- "+check_day.isSelected());
		*/
		
		//selecting all checkboxes
		List<WebElement> check_weekdays = chrome_driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//For Each Version
	
		/*
		for(WebElement x:check_weekdays)
		{
			System.out.println(x.getAttribute("value"));
			x.click();
			Thread.sleep(500);
		}*/
		
		//Traditional For Loop
		for(int i=0;i<check_weekdays.size();i++)
		{
			check_weekdays.get(i).click();
			System.out.println(check_weekdays.get(i).getAttribute("value"));
			Thread.sleep(500);
		}
		
	}
}
