package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("https://demo.nopcommerce.com/");
		
		/*
		//standard
		chrome_driver.findElement(By.id("small-searchterms"));
		chrome_driver.findElement(By.name("q"));
		//css selector
		chrome_driver.findElement(By.cssSelector("input#small-searchterms"));
		*/
		/*
		//absolute xpath
		chrome_driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/input")).sendKeys("Fahrenheit 451 by Ray Bradbury");
		chrome_driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
		*/
		
		//relative xpath
		chrome_driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Fahrenheit 451 by Ray Bradbury");
		chrome_driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}

}

