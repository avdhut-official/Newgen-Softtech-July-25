package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicsAutomation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating driver object to open chrome browser
		WebDriver chrome_driver=new ChromeDriver();
		
		//maximize the browser
		chrome_driver.manage().window().maximize();
		
		//will take you to requested webpage
		chrome_driver.get("https://www.flipkart.com");
		
		//get the title of webpage
		String source_title="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String web_title=chrome_driver.getTitle();
		
		if(source_title.equals(web_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		chrome_driver.quit();
	}
}










