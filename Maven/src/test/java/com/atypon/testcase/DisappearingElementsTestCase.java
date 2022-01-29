package com.atypon.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.DisappearingElementsPage;

public class DisappearingElementsTestCase extends TestBase{

	public DisappearingElementsTestCase() {
		// TODO Auto-generated constructor stub
		super();

	}
	
	DisappearingElementsPage disappearingElementsPage;
	@Test(priority=20)

	public void CheckDisappearingElementsPage() throws InterruptedException 
	{
		disappearingElementsPage=new DisappearingElementsPage();
		boolean checkInGallery=disappearingElementsPage.DisappearingElements();
		Assert.assertEquals(true,checkInGallery);
	}

}
