package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://demo.nopcommerce.com/");
		
		//using id -- tag#id --
		
		//WebElement txt_search=chrome_driver.findElement(By.cssSelector("input#small-searchterms"));
		//txt_search.sendKeys("iphone 17");
	
		/*
		//using without tag -- #id
		chrome_driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Apple MacBook Pro");
		
		//using classname -- tag.classname
		chrome_driver.findElement(By.cssSelector("button.button-1")).click();
		chrome_driver.findElement(By.cssSelector("button.button-2.product-box-add-to-cart-button")).click();
		*/
		
		//Using CSS Selector - attribute - tag[attribute="value"]
		chrome_driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("HTC smartphone");
		
	}

}
