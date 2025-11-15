package com.selenium.basics.selenium_maven_project;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsInSelenium {
	
	//class variables
		WebDriver chromeDriver;
		
		public void setup()
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--start-maximized"); //maximize window
			options.addArguments("--incognito");		//incognito mode
			options.addArguments("--headless=new");		//work in background
			options.setAcceptInsecureCerts(true);		//accept ssl certificate
			
			chromeDriver=new ChromeDriver(options);
			chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			chromeDriver.get("https://www.facebook.com");
			
			System.out.println(chromeDriver.getTitle());		
		}
		
		public static void main(String[] args) {
			ChromeOptionsInSelenium ci=new ChromeOptionsInSelenium();
			ci.setup();
		}
		
}
