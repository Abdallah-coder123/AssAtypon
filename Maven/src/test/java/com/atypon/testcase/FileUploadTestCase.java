package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.FileUploadPage;

public class FileUploadTestCase extends TestBase {

	public FileUploadTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	FileUploadPage fileUploadPage=new FileUploadPage();
	@Test(priority=15)
	public void TestFileUpload()
	{
		
		fileUploadPage.UploadFile("C:\\Users\\abood\\Desktop\\FileUpload");
		
		
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
//	@Test(priority=15)
//	public void TestDragDropFileUpload()
//	{
//		
//			fileUploadPage.DragDropUpload("C:\\Users\\abood\\Desktop\\FileUpload", 3);
//		
//		
//		
//	}
	

}
