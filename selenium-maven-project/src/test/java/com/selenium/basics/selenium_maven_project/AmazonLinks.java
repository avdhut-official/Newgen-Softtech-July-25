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
		
		/*
		//Count of all links on Amazon Home Page
		List<WebElement> link_tag = chrome_driver.findElements(By.tagName("a"));
		System.out.println(link_tag.size());
		
		//link_tag --- 360 -- a[0],a[1]
		for(WebElement a:link_tag)
		{
			System.out.println(a.getText()+" : "+a.getAttribute("href"));
		}
		
		*/

		//Attribute Class - nav-input nav-progressive-attribute
		
		WebElement txt_search = chrome_driver.findElement(By.className("nav-input"));
		//txt_search.sendKeys("Iphone 17");
		
		
		//Multiple WebElement using Class Name
		List<WebElement> txt_search_multiple = chrome_driver.findElements(By.className("nav-input"));
		System.out.println(txt_search_multiple.size());
		
		for(WebElement x:txt_search_multiple)
		{
			if(x.getAttribute("type").equals("text"))
			{
				x.sendKeys("iphone 17");
			}
			else
			{
				x.click();
			}
		}
		
	}
}