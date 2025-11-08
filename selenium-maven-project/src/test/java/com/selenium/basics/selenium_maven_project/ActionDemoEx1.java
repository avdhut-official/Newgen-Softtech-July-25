package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://demo.nopcommerce.com/");
		WebElement electronics_link = chrome_driver.findElement(By.linkText("Electronics"));
		
		//WebElement camera_link=chrome_driver.findElement(By.xpath("//a[contains(text(),'Camera & photo')]"));
		WebElement camera_link=chrome_driver.findElement(By.xpath("//a[normalize-space()='Camera & photo']"));
		
		Actions mouse_act=new Actions(chrome_driver);
		
		//Mouse hover
		
		//mouse_act.moveToElement(electronics_link).moveToElement(camera_link).click().build().perform();
		mouse_act.moveToElement(electronics_link).moveToElement(camera_link).click().perform();
	}
}















