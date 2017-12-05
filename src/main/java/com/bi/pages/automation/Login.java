package com.bi.pages.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bi.base.automation.TestBase;

public class Login extends TestBase
{
	public void loginToApp()
	{
		driver.get("http://www.cholainsurance.com");
	}
	
}	
