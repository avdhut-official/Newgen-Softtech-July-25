package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoDragnDrop {
	
	
	
	//class variable
	WebDriver chrome_driver;
	Actions mouse_act;
	

	//opening a browser and navigating to particular URL
	public void setup()
	{
		chrome_driver=new ChromeDriver();
		
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	public void drag_n_drop()
	{
		WebElement bank_drag=chrome_driver.findElement(By.id("credit2"));
		WebElement bank_drop=chrome_driver.findElement(By.id("bank"));
		
		mouse_act=new Actions(chrome_driver);
		mouse_act.dragAndDrop(bank_drag, bank_drop).build().perform();
		
	}
	
	public static void main(String[] args) {
		
		ActionDemoDragnDrop drag=new ActionDemoDragnDrop();
		drag.setup();
		drag.drag_n_drop();
	}
}
