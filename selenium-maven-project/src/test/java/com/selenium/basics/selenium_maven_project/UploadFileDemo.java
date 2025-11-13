package com.selenium.basics.selenium_maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileDemo {
	
	WebDriver driver;
	
	public void setup()
	{
		System.setProperty("web.chrome.driver", "C:\\Users\\ip-slim-3\\Git DCTC\\DCTC-Automation\\May 23 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	public void uploadFile() throws InterruptedException
	{
		String file_path1="C:\\Users\\ip-slim-3\\Desktop\\TestAutomation.pdf";
		String file_path2="C:\\Users\\ip-slim-3\\Downloads\\Trailblazer Policy 3.pdf";
		driver.findElement(By.id("uploadfile_0")).sendKeys(file_path2);
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
	}
	
	public void upload_with_robot() throws InterruptedException, AWTException
	{
		StringSelection file_path3=new StringSelection("C:\\Users\\ip-slim-3\\Desktop\\TestAutomation.pdf");
		
		//Clipboard Copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file_path3, null);
		
		WebElement upload_file=driver.findElement(By.id("uploadfile_0"));
		Actions ac=new Actions(driver);
		ac.moveToElement(upload_file).click().build().perform();
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		UploadFileDemo m=new UploadFileDemo();
		m.setup();
		m.upload_with_robot();
	}

}
