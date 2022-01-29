package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.TyposPage;

public class TyposTestCase extends TestBase{

	public TyposTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	TyposPage typosPage;
	@Test(priority=23)
	public void check() throws InterruptedException
	{
		typosPage=new TyposPage();
		String actuall=typosPage.CheckSpelling();
		Assert.assertEquals(actuall,"won,t.");
	}

}
