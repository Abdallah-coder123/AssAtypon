package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.RedirectLinkPage;

public class RedirectLinkTestCase extends TestBase {

	public RedirectLinkTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	RedirectLinkPage redirectlinkpage=new RedirectLinkPage();
	
	@Test(priority=9)
	public void RedirectLink()
	{
		redirectlinkpage.ClickInRedirect();
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
