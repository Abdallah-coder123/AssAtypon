package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.ForgetPasswordPages;

public class ForgetPasswordTestCase extends TestBase{

	public ForgetPasswordTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	ForgetPasswordPages forgetPassword;
	@Test(priority=23)
	public void ForgetPassword()
	{
		forgetPassword=new ForgetPasswordPages();
		String actualText =forgetPassword.enterEmail("aboodsaleh77a@gmail.com");
		Assert.assertEquals("Internal Server Error",actualText);
		
	}
	

}
