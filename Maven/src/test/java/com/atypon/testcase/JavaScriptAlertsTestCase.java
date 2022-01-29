package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.JavaScriptAlertsPage;

public class JavaScriptAlertsTestCase extends TestBase{

	public JavaScriptAlertsTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static JavaScriptAlertsPage javascriptalertspage;
	
	@Test(priority=12)
	public void TestCaseJsalert()
	{
		javascriptalertspage=new JavaScriptAlertsPage();
		String actuallResult= javascriptalertspage.JsalertButton();
		Assert.assertEquals( "You successfully clicked an alert",actuallResult);
		
		
		
	}
	
	@Test(priority=13)
	public void TestCaseJsConfirm()
	{
		javascriptalertspage=new JavaScriptAlertsPage();
		String actuallResult= javascriptalertspage.JsConfirmButton();
		Assert.assertEquals( "You clicked: Ok",actuallResult);
		
		
	}
	
	@Test(priority=14)
	public void TestCaseJsPrompt()
	{
		javascriptalertspage=new JavaScriptAlertsPage();
		String actuallResult= javascriptalertspage.JsPromptButton();
		Assert.assertEquals( "You entered: Abdallah",actuallResult);
		
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
