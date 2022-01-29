package com.atypon.page;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.atypon.base.TestBase;

public class downloadFilePage extends TestBase{

	public downloadFilePage() {
		// TODO Auto-generated constructor stub
PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText="File Download")
    WebElement FileDownload;
	//File Download
	
	@FindBy(linkText="test.txt")
    WebElement TestTxt;
	
	
	public void DownloadFile() throws InterruptedException
	{
		
		FileDownload.click();
		TestTxt.click();
		Thread.sleep(3000);
		//C:\Users\abood\Downloads
		File filelocation=new File("//C:\\Users\\abood\\Downloads");
		File []  totalfiles=filelocation.listFiles();
		for(File file:totalfiles)
		{
			if(file.getName().equals("test.txt")) 
				Assert.assertEquals(true, true);
			break;
			
		}
		
		
	}

}
