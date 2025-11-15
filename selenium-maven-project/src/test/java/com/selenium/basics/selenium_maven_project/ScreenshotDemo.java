package com.selenium.basics.selenium_maven_project;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	//class variables
	WebDriver chromeDriver;
	String property;
	
	public void setup()
	{
		chromeDriver=new ChromeDriver();	//opened the browser in default width and height
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromeDriver.get("https://www.facebook.com");
	}
	
	public void TakeScreenshotFullWindow()
	{
		property=System.getProperty("user.dir");	//getting path/location of the project folder
		//System.out.println(property);
		
		//Take screenshot window
		TakesScreenshot camera=(TakesScreenshot)chromeDriver;
		File source=camera.getScreenshotAs(OutputType.FILE);
		File dest=new File(property+"\\screenshot\\2.png");
		source.renameTo(dest);
	}
	
	public void navigateToAmazon() throws InterruptedException
	{
		Thread.sleep(3000);
		chromeDriver.navigate().to("https://www.amazon.com/");
		WebElement logo=chromeDriver.findElement(By.id("nav-logo-sprites"));	
		System.out.println(chromeDriver.getTitle());

		File source=logo.getScreenshotAs(OutputType.FILE);
		File dest=new File(property+"\\screenshot\\3.png");
		source.renameTo(dest);
		
		WebElement footer_links=chromeDriver.findElement(By.xpath("//div[@aria-label='More on Amazon']"));

		source=footer_links.getScreenshotAs(OutputType.FILE);
		dest=new File(property+"\\screenshot\\4.png");
		source.renameTo(dest);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ScreenshotDemo sd=new ScreenshotDemo();
		sd.setup();
		sd.TakeScreenshotFullWindow();
		sd.navigateToAmazon();
	}
}





