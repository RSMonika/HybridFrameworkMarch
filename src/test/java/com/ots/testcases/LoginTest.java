package com.ots.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ots.base.base;
import com.ots.pages.HomePage;
import com.ots.pages.LoginPage;

public class LoginTest extends base
{
	LoginPage login;
	///we can call LoginPage-methods in both the methods in test class//

	@Test
	public void validlogin() 
	{
		login=new LoginPage(driver);
		//LoginPage login=new LoginPage();---make it global to use in another test
		HomePage home=login.Logintoapplication("admin@email.com", "admin@123");
		//Assert.assertTrue(home.isWelcomeMsgVisble(), "login Failed");//Returns homepage
	}   
	@Test
	public void verifynewlink()
	{
		login=new LoginPage(driver);
		Assert.assertTrue(login.isVisible(),"Link not present");
	}

}
