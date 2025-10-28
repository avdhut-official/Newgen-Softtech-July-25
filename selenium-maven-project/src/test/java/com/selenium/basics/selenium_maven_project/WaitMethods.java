package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://demo.nopcommerce.com/");
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//no such web element - we have wrong locator
		WebElement txt_search= chrome_driver.findElement(By.id("small-searchterms"));
		
		chrome_driver.navigate().to("https://www.facebook.com/");
		
		//no such web element - we have wrong locator
		chrome_driver.findElement(By.id("small-searchterms"));
		
		//stale element exception - we try to perform action on the old located web element which is not available
		//txt_search.sendKeys("iphone 17");
		
	}

}