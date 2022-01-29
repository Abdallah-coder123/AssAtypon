package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.DynamicallyLoadedPageElements;

public class DynamicallyLoadedPageElementsTestCase extends TestBase{

	public DynamicallyLoadedPageElementsTestCase() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	DynamicallyLoadedPageElements Dynamically;
	
	@Test(priority=21)
	public void DynamicallyLoaded() throws InterruptedException
	{
		Dynamically=new DynamicallyLoadedPageElements();
		String TextAfterLoading=Dynamically.DynamicLoading();
		Assert.assertEquals("Hello World!",TextAfterLoading);
	}

}
