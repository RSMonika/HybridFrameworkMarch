package com.ots.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ots.factory.BrowseFactory;

public class base {
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.out.println("LOG INFO-Starting browser-Running before Method");
		 driver =BrowseFactory.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");//Below 3 lines can be replaced with this
		/*driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
		System.out.println("LOG INFO-Browser and application up and running");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("LOG INFO-Closing browser-Running After Method");
		driver.quit();
		System.out.println("LOG INFO-Session Closed");
	}
}
