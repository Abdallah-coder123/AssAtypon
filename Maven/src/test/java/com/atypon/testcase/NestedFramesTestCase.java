package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.nestedFramesPage;

public class NestedFramesTestCase extends TestBase{

	public NestedFramesTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	nestedFramesPage Frames;
	@Test(priority=18)
	public void HandelFramesTestCase()
	{
		Frames=new nestedFramesPage();
		String actuall=Frames.HandelFrames();
		Assert.assertEquals( "MIDDLE",actuall);
		
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
