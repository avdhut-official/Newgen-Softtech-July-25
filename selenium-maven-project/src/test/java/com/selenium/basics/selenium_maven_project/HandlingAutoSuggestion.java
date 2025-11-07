package com.selenium.basics.selenium_maven_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Google Auto Suggestion
		chrome_driver.get("https://www.google.com/");
		//Thread.sleep(5000);
		chrome_driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Automation");
		List<WebElement> all_suggestion = chrome_driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(all_suggestion.size());
		
		for(WebElement x:all_suggestion)
		{
			System.out.println(x.getText());
			
			/*String value=x.getText();
			if(value.equals("automation"))
			{
				x.click();
				break;
			}*/
		}
		
		Thread.sleep(15000);
		
		//Amazon Auto Suggestion
		chrome_driver.get("https://www.amazon.in/");
		//Thread.sleep(5000);
		chrome_driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		all_suggestion = chrome_driver.findElements(By.xpath("//div[@role='row']//div[@role='gridcell']//div[@role='button']"));
		System.out.println(all_suggestion.size());
		for(WebElement x:all_suggestion)
		{
			System.out.println(x.getText());
		}
	}
}