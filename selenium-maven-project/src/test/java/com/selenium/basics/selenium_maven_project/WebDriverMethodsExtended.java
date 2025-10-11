package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsExtended {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(3000);  //it ask the script to wait for 5 seconds

		
		//chrome_driver.get("https://www.facebook.com/");
		//navigate interface - to() - it will maintain the history
		
		chrome_driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		chrome_driver.navigate().back();
		Thread.sleep(3000);
		
		chrome_driver.navigate().forward();
		Thread.sleep(3000);
		
		chrome_driver.navigate().refresh();
		
	}
}