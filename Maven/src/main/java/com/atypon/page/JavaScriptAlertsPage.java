package com.atypon.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.atypon.base.TestBase;

public class JavaScriptAlertsPage extends TestBase{

	public JavaScriptAlertsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	//JavaScript Alerts
	
	
	@FindBy(linkText="JavaScript Alerts")
	WebElement JavaScriptAlertsLink;
	
	@FindBy(xpath="//button[@onclick='jsAlert()']")
	WebElement JsAlert;
	
	@FindBy(xpath="//button[@onclick='jsConfirm()']")
	WebElement JsConfirm;
	
	@FindBy(xpath="//button[@onclick='jsPrompt()']")
	WebElement JsPrompt;
	
	@FindBy(id="result")
	WebElement notifyText;
	
	
	
	public  String JsalertButton()
	{
		JavaScriptAlertsLink.click();
		
		JsAlert.click();
		driver.switchTo().alert().accept();
	   return notifyText.getText();	
	   
	}
	
	public  String JsConfirmButton()
	{
		//JavaScriptAlertsLink.click();
		JsConfirm.click();
		driver.switchTo().alert().accept();
	      return notifyText.getText();	
	}
	
	public  String JsPromptButton()
	{
		JavaScriptAlertsLink.click();

		this.JsPrompt.click();
		driver.switchTo().alert().sendKeys("Abdallah");
		driver.switchTo().alert().accept();
	      return notifyText.getText();	

		
		
	    	
	}

}
