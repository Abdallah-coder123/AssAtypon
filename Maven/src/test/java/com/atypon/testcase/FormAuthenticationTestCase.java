package com.atypon.testcase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.FormAuthenticationPage;

public class FormAuthenticationTestCase extends TestBase {

	public FormAuthenticationTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	FormAuthenticationPage formAuthenticationPage;
	
	@Test(priority=9)
	public void loginTestCase() {
		formAuthenticationPage=new FormAuthenticationPage();
		String AlertText=formAuthenticationPage.Login();
//		String[] arrOfStr = AlertText.split("x", 2);
		//System.out.println(AlertText);
		Assert.assertEquals("Your username is invalid!",AlertText.substring(0, 25));

	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
	

}
