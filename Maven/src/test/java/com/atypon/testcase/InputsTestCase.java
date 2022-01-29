package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.InputPage;
import org.testng.Assert;



public class InputsTestCase extends TestBase {

	public InputsTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	InputPage inputPage;
	
	@Test(priority=10)
	public void inputsNumer()
	{
		this.inputPage=new InputPage();
		String ActualNumber=this.inputPage.SendNumber(6);
		Assert.assertEquals(ActualNumber, "6");
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();
    }
	

}
