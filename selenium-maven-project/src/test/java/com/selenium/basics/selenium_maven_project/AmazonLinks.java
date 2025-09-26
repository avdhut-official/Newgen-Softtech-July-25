package com.selenium.basics.selenium_maven_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
	
	public static void main(String[] args) {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome_driver.get("https://www.amazon.com/");
		
		/*
		WebElement link_text=chrome_driver.findElement(By.partialLinkText("Amazon"));
		link_text.click();
		
		WebElement link_text=chrome_driver.findElement(By.linkText("Amazon Devices"));
		link_text.click();
		*/
		
		//Count of all links on Amazon Home Page
		List<WebElement> link_tag = chrome_driver.findElements(By.tagName("a"));
		System.out.println(link_tag.size());
		
		for(WebElement a:link_tag) 
		{
			System.out.println(a.getText()+" : "+a.getAttribute("href"));
		}
		
		
		//System.out.println(link_tag.getAttribute("href"));
	}
}
