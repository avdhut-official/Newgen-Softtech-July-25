package com.selenium.basics.selenium_maven_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://practice-automation.com/popups/");
		Thread.sleep(5000);
		
		chrome_driver.findElement(By.id("alert")).click();
		
		//switching the driver to alert window/pop up
		Alert popup = chrome_driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(popup.getText());	//to get text available on alert window
		popup.accept();		//it will click on ok button of alert
		
		Thread.sleep(1000);
		chrome_driver.findElement(By.id("confirm")).click();
		
		//switch to confirm alert
		popup = chrome_driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(popup.getText());
		popup.dismiss();	//it will click on cancle button of alert
		//popup.accept();
		
		
		WebElement confirm_result_alert = chrome_driver.findElement(By.id("confirmResult"));
		System.out.println(confirm_result_alert.getText());
		
		//switch to prompt alert
		chrome_driver.findElement(By.id("prompt")).click();
		popup=chrome_driver.switchTo().alert();
		Thread.sleep(5000);
		popup.sendKeys("Avdhut");
		Thread.sleep(2000);
		popup.accept();
	}

}
