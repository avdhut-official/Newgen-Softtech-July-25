package com.selenium.basics.selenium_maven_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
	public static void main(String[] args) {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://demo.nopcommerce.com/");
		
		String title=chrome_driver.getTitle();
		System.out.println(title);
		
		String current_url=chrome_driver.getCurrentUrl();
		System.out.println(current_url);
		
		/*
		chrome_driver.get("https://www.facebook.com/");
		current_url=chrome_driver.getCurrentUrl();
		System.out.println(current_url);*/
		
		WebElement register_link=chrome_driver.findElement(By.linkText("Register"));
		WebElement login_link=chrome_driver.findElement(By.linkText("Log in"));
		
		//way around for a new tab
		String openInNewTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		register_link.sendKeys(openInNewTab);
		login_link.sendKeys(openInNewTab);
		
		
		
		Set<String> all_tabs=chrome_driver.getWindowHandles();
		System.out.println(all_tabs);
		
		System.out.println(chrome_driver.getWindowHandle());
		
		/*
		String window_handle=chrome_driver.getWindowHandle();
		System.out.println(window_handle);
		
		chrome_driver.findElement(By.linkText("Log in")).click();
		*/
		
		
		
	}
}
