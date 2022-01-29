package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class FileUploadPage extends TestBase {

	public FileUploadPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	//File Upload
	@FindBy(linkText="File Upload")
    WebElement FileUploadLink;
	
	@FindBy(id="file-upload")
    WebElement Choose_File;
	
	//file-submit
	@FindBy(id="file-submit")
    WebElement Submit;
	
	@FindBy(xpath="//div[@id='drag-drop-upload']")
	WebElement DragDropUpload;
	
	public void UploadFile(String url)
	{
	    FileUploadLink.click();
      //  Choose_File.click();	
		Choose_File.sendKeys(url);
		
		Submit.click();
		
	}
	
//	public void DragDropUpload(String url,int numOfFile)
//	{
//		  FileUploadLink.click();
//		for(int i=0;i<numOfFile;i++)
//		{
//			
//			DragDropUpload.click();
//        	
//			DragDropUpload.sendKeys(url);
//			
//		}
//		Submit.click();
//		
//	}
	

}
