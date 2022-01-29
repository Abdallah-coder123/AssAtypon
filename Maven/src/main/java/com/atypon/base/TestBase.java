package com.atypon.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestBase  {

	public static WebDriver driver;
	
	
	public TestBase()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abood\\eclipse-workspace\\Maven\\src\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	 driver.get("http://the-internet.herokuapp.com/");
	}
	
	
	
}
