package com.selenium.basics.selenium_maven_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTableEx1 {
	
	public static void main(String[] args) {
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome_driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//rows in a table
		int rows=chrome_driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr")).size();
		System.out.println("No of Rows :"+rows);
		
		//column in a table
		int column=chrome_driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr//th")).size();
		System.out.println("No of Columns :"+column);
		
		//locate specific 2nd row and 2nd column
		WebElement specific_value= chrome_driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[2]//td[2]"));
		System.out.println(specific_value.getText());
		
		List<WebElement> complete_table = chrome_driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr"));
		for(WebElement x:complete_table)
		{
			System.out.println(x.getText());
		}
	}

}
