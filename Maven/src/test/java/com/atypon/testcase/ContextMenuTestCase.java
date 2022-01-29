package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.ContextMenuPage;


public class ContextMenuTestCase extends TestBase {

	public ContextMenuTestCase() {
		// TODO Auto-generated constructor stub
		
	}
	ContextMenuPage contextMenuPage;
	@Test(priority=19)
	public void ContextMenuPage()
	{
		contextMenuPage=new ContextMenuPage();
	contextMenuPage.ContextMenu();
	
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
