package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethodsExtended {
	
	public static void main(String[] args) {
		
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		
		//implicit wait - global wait for all findElement methods
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		chrome_driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		WebElement username=chrome_driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=chrome_driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}
}