package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver chrome_driver=new ChromeDriver();
		chrome_driver.manage().window().maximize();
		
		chrome_driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Explicit Wait - Condition based Wait
		WebDriverWait exp_wait=new WebDriverWait(chrome_driver, Duration.ofSeconds(10));
		WebElement username = exp_wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		WebElement password= exp_wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		WebElement btn_login=exp_wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
		btn_login.click();
	}
}