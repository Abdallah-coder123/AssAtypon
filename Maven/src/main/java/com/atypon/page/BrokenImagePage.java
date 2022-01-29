package com.atypon.page;

import java.util.List;

import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.atypon.base.TestBase;

public class BrokenImagePage extends TestBase {

	public BrokenImagePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
//	@FindBy(tagName="img")
//	WebElement img;
	List<WebElement>elementList=driver.findElements(By.tagName("img"));
	public void brokenImages()
	{
		
//		for(int i=0;i<elementList.size();i++)
//		{
//			Response response=RestAssured.given().contentType("application/json").get(elementList.get(i).getAttribute("src"));
//			System.out.println("print http response"+response.getStatusCode());
//			
//			if(elementList.get(i).getAttribute("naturalWidth").equals(0)) {
//				System.out.println(elementList.get(i).getAttribute("src")+" is broken.");
//			}
//			else {
//				System.out.println(elementList.get(i).getAttribute("src")+" is not broken.");
//
//				
//			}
		
		//I can not Complete testCase in broken image because some problems in import restAssured
			
		}
	}

//}
