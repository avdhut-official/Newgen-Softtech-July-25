package com.selenium.basics.selenium_maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	WebDriver chromeDriver;
	JavascriptExecutor js;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavaScriptExecutorDemo jd=new JavaScriptExecutorDemo();
		jd.setup();
		jd.js_setAttribute();
		jd.js_click();
		jd.js_scroll();
		jd.js_scroll_to_view();
	}
	
	public void setup()
	{
		chromeDriver=new ChromeDriver();	//opened the browser in default width and height
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromeDriver.get("https://testautomationpractice.blogspot.com/");
		js=(JavascriptExecutor)chromeDriver;	
	}
	
	public void js_setAttribute()
	{
		WebElement name= chromeDriver.findElement(By.id("name"));
		
		//alternate for sendKeys method of WebElement
		
		js.executeScript("arguments[0].setAttribute('value','Avdhut')", name);
		
		WebElement email=chromeDriver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','avdhut.bhiseofficial@gmail.com')", email);
		
		
	}
	
	public void js_click() throws InterruptedException
	{
		//alternate to click method of WebElement
		Thread.sleep(3000);
		WebElement chk_sunday=chromeDriver.findElement(By.id("sunday"));
		//js.executeScript("arguments[0].scrollIntoView(true);", chk_sunday);
		js.executeScript("arguments[0].click()", chk_sunday);
		
		WebElement radio_male=chromeDriver.findElement(By.id("male"));
		js.executeScript("arguments[0].click()", radio_male);
	}
	
	public void js_scroll() throws InterruptedException
	{
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)", "");
	}
	
	public void js_scroll_to_view() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement table=chromeDriver.findElement(By.xpath("//h2[contains(text(),'Static')]"));
		js.executeScript("arguments[0].scrollIntoView()", table);
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='67%'");
	}
	
}















