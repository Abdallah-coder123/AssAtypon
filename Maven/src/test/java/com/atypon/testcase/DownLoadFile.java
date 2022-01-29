package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.downloadFilePage;

public class DownLoadFile extends TestBase {

	public DownLoadFile() {
		// TODO Auto-generated constructor stub
		super();
	}
	downloadFilePage downLoad;
	@Test(priority=4)
	public void DownloadImage() throws InterruptedException
	{
		downLoad=new downloadFilePage();
	downLoad.DownloadFile();
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
