package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.DragAndDropPage;

public class DragAndDropTestCase extends TestBase{

	public DragAndDropTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	DragAndDropPage dragAndDropPage;
	@Test(priority=17)
	public void TestCaseDragAndDrop()
	{
		dragAndDropPage=new DragAndDropPage();
		dragAndDropPage.DragDrop();
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }


}
