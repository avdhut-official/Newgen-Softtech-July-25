package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoEx3 {
	
	//class variable
	WebDriver chrome_driver;
	Actions mouse_act;
	Alert alt;
	
	//opening a browser and navigating to particular URL
	public void setup()
	{
		chrome_driver=new ChromeDriver();
		
		chrome_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	public void right_click_action()
	{
		WebElement right_click = chrome_driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		mouse_act=new Actions(chrome_driver);
		
		//right click
		mouse_act.contextClick(right_click).build().perform();
		
		//locate and click on Web Element
		chrome_driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
	}
	
	public void double_click() throws InterruptedException
	{
		WebElement double_click=chrome_driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	
		//double click
		mouse_act.doubleClick(double_click).build().perform();
		
		handle_alert();
	}
	
	public void handle_alert() throws InterruptedException
	{
		//Handling Alert
		Thread.sleep(3000);
		alt=chrome_driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		ActionDemoEx3 act=new ActionDemoEx3();
		act.setup();
		act.right_click_action();
		act.handle_alert();
		act.double_click();
	}
}






