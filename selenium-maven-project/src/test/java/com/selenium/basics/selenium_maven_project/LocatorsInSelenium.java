package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	public static void main(String[] args) {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://facebook.com/");
		
		//located web element using id for textfield email
		WebElement user_email = chrome_driver.findElement(By.id("email"));
		user_email.sendKeys("avdhut.bhiseofficial@test.com");
		
		//located web element using id for textfield password
		WebElement user_password= chrome_driver.findElement(By.id("pass"));
		user_password.sendKeys("12334588999");
		
		//located web element using name for button login
		WebElement btn_login= chrome_driver.findElement(By.name("login"));
		btn_login.click();
	}
}




