package com.selenium.basics.selenium_maven_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	WebDriver driver;
	
	public void setup()
	{
		System.setProperty("web.chrome.driver", "C:\\Users\\ip-slim-3\\Git DCTC\\DCTC-Automation\\May 23 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	public void clickOnOpenWindow() throws InterruptedException
	{
		driver.findElement(By.id("openwindow")).click();
		
		String main_window=driver.getWindowHandle();
		Set<String> all_window = driver.getWindowHandles();
		
		
		System.out.println("Parent Window : "+main_window);
		
		for(String x:all_window)
		{
			System.out.println("Window Handle : "+x);
			if(!x.equals(main_window))
			{
				driver.switchTo().window(x);
				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("Courses")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(main_window);
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		MultipleWindowHandling m=new MultipleWindowHandling();
		m.setup();
		m.clickOnOpenWindow();
	}

}
