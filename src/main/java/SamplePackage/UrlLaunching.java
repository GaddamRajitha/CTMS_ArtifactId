package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UrlLaunching {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void tearUp()
	{
	driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/");
		
	}
    @Test
	public void GoogleLaunch()
	{
    	driver.findElement(By.id("sdfdf")).click();
		System.out.println("Google Website Launched");
		//System.out.println("Differences Check");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	

}
