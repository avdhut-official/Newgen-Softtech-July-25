package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoEx2 {
	
	public static void main(String[] args) {
		
		WebDriver chrome_driver=new ChromeDriver();
		
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		WebElement right_click = chrome_driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		WebElement double_click=chrome_driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		
		Actions mouse_act=new Actions(chrome_driver);
		
		//right click
		mouse_act.contextClick(right_click).build().perform();
		
		//double click
		mouse_act.doubleClick(double_click).build().perform();
		
		//Handling Alert
		Alert alt=chrome_driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
}
