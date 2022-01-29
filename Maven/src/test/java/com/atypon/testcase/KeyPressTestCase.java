package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.KeyPressPage;

public class KeyPressTestCase extends TestBase {

	public KeyPressTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	KeyPressPage keypresspage=new KeyPressPage();
	
	@Test(priority=6)
	public void TabPress()
	{
		keypresspage.TabPresses();	
	}
	
	@Test(priority=7)
	public void EnterPress()
	{
		keypresspage.EnterPresses();;	
	}
	
	@Test(priority=8)
	public void escapePress()
	{
		keypresspage.escapePresses();	
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
	
	
	

}
