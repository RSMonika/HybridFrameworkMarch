package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Page object model//
//class--method---By 
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) //CONSTRUCTOR
	{
		this.driver=driver;
	}
	By username=By.id("email1");
	By password=By.id("password1");
	By loginbutton=By.xpath("//button[text()='Sign in']");
	By createnewuser=By.xpath("//a[@class='subLink']");
	
	public boolean isVisible()//method for second class
	{
		boolean status=driver.findElement(createnewuser).isDisplayed();
		return status;
	}
	public boolean isWelcomeMsgVisble()//method for second class
	{
		boolean status=driver.findElement(createnewuser).isDisplayed();
		return status;
	}
    
	public HomePage Logintoapplication(String uname,String pass)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
		HomePage home=new HomePage();
		return home;
	}
	
}




