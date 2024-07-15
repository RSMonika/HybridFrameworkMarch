package com.ots.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowseFactory 
{
	static WebDriver driver;
	public static WebDriver startBrowser(String browser,String appURL)	
	{
		if(browser.equalsIgnoreCase("Chrome"))	
		{
			driver=new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("Firefox"))	
		{
			driver=new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("Edge"))	
		{
			driver=new EdgeDriver();	
		}
		
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//should always before getting url
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get(appURL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//can be before or after get url
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
