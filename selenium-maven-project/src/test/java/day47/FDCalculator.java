package day47;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	
	WebDriver chromeDriver;
	String file_path;
	String sheet_name="Sheet1";
	int no_of_row;
	String principle_amt,roi,period_1,period_2,exp_mat_value, actual_mat_value,freq;
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized"); //maximize window
		options.addArguments("--disable-notifications");
		//options.addArguments("--incognito");		//incognito mode
		//options.addArguments("--headless=new");		//work in background
		//options.setAcceptInsecureCerts(true);		//accept ssl certificate
		
		chromeDriver=new ChromeDriver(options);
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromeDriver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		
		System.out.println(chromeDriver.getTitle());		
	}
	
	
	public void getData() throws IOException, InterruptedException
	{
		file_path=System.getProperty("user.dir")+"\\TestData\\caldata.xlsx";
		System.out.println(file_path);
		no_of_row=ExcelDataUtility.getRowCount(file_path, sheet_name);
		
		for(int i=1;i<=no_of_row;i++)
		{
			//read data from excel
			principle_amt=ExcelDataUtility.getCellData(file_path, sheet_name, i, 0);
			roi=ExcelDataUtility.getCellData(file_path, sheet_name, i, 1);
			period_1=ExcelDataUtility.getCellData(file_path, sheet_name, i, 2);
			period_2=ExcelDataUtility.getCellData(file_path, sheet_name, i, 3);
			freq=ExcelDataUtility.getCellData(file_path, sheet_name, i, 4);
			exp_mat_value=ExcelDataUtility.getCellData(file_path, sheet_name, i, 5);
			
			//Locate webelement and send data to application
			chromeDriver.findElement(By.id("principal")).sendKeys(principle_amt);
			chromeDriver.findElement(By.id("interest")).sendKeys(roi);
			chromeDriver.findElement(By.id("tenure")).sendKeys(period_1);
			
			//WebElement sel_period=chrome_driver.findElement(By.id("tenurePeriod"));
			
			Select period=new Select(chromeDriver.findElement(By.id("tenurePeriod")));
			period.selectByVisibleText(period_2);
			
			Select frequency=new Select(chromeDriver.findElement(By.id("frequency")));
			frequency.selectByVisibleText(freq);
			
			//clicking on Calculate Button
			
			//chromeDriver.findElement(By.xpath("//form[@id='fdMatVal']//a[1]")).click();
			//chromeDriver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//finally used this still failed and then added chrome options to disable notifications and its worked
			chromeDriver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			//Validation
			actual_mat_value=chromeDriver.findElement(By.xpath("//span[@id=\"resp_matval\"]//strong")).getText();
			//its in String format for comparing this with actual we need to convert Double format
			
			System.out.println(actual_mat_value);
			
			if(Double.parseDouble(actual_mat_value)==Double.parseDouble(exp_mat_value))
			{
				System.out.println("Test Passed");
				ExcelDataUtility.setCellData(file_path, sheet_name, i, 7, "Passed");
				ExcelDataUtility.fillGreenColor(file_path, sheet_name, i, 7);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelDataUtility.setCellData(file_path, sheet_name, i, 7, "Failed");
				ExcelDataUtility.fillRedColor(file_path, sheet_name, i, 7);
			}
			clearDetails();
		}	
	}
	
	public void clearDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		chromeDriver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_clear.gif']")).click();
	}	

	public void tearDown()
	{
		chromeDriver.quit();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		FDCalculator fd=new FDCalculator();
		fd.setup();
		fd.getData();
		fd.tearDown();
	}
}