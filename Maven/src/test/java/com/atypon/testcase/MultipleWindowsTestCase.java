package com.atypon.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.MultipleWindowsPage;

public class MultipleWindowsTestCase extends TestBase {

	public MultipleWindowsTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	MultipleWindowsPage multipleWindows=new MultipleWindowsPage();
	
	@Test(priority=16)
	public void TestCaseMultipleWindow()
	{
		
		String ChildWindowUrl=multipleWindows.window();
		
		Assert.assertEquals("http://the-internet.herokuapp.com/windows/new", ChildWindowUrl);
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
	

}
