package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.HoverPage;

public class HoverTestCase extends TestBase{

	public HoverTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	HoverPage hoverPage;
	
	@Test(priority=5)
	public void hoverAction()
	{
		hoverPage=new HoverPage();
		hoverPage.MouseHover();
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
