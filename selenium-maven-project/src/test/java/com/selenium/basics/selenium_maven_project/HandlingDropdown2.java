package com.selenium.basics.selenium_maven_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://codefixup.com/demo/multiselect-dropdown-with-checkbox/");
		
		Thread.sleep(2000);
		chrome_driver.findElement(By.xpath("//div[@class='multi-select-container']")).click();
		
		//selecting one dropdown value
		Thread.sleep(2000);
		//chrome_driver.findElement(By.xpath("//input[@value='alice']")).click();
		
		//displaying labels of web elements
		List<WebElement> all_people = chrome_driver.findElements(By.xpath("//div[@class='multi-select-menuitems']//label"));
		
		//printing labels
		for(WebElement each_people:all_people)
		{
			System.out.println(each_people.getText());
			
			String name=each_people.getText();
			if(name.equals("Alice") || name.equals("Carol"))
			{
				each_people.click();
			}
		}
	}
}
