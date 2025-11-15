package com.selenium.basics.selenium_maven_project;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver chrome_driver= new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		chrome_driver.get("https://www.google.com");
		
		String property=System.getProperty("user.dir");
		
		//Taking Screenshot
		
		TakesScreenshot camera=(TakesScreenshot)chrome_driver;
		File source=camera.getScreenshotAs(OutputType.FILE);
		File dest=new File(property+"\\screenshot\\1.png");
		
		source.renameTo(dest);
		
		WebElement search= chrome_driver.findElement(By.name("q"));
		search.sendKeys("Automation");
		File source_new=search.getScreenshotAs(OutputType.FILE);
		File dest_new=new File(property+"\\screenshot\\2.png");
		source_new.renameTo(dest_new);
	}

}
