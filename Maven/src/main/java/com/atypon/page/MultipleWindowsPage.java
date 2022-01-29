package com.atypon.page;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class MultipleWindowsPage extends TestBase {

	public MultipleWindowsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Multiple Windows")
	WebElement MultipleWindowLink;
	 
	//Click Here
	@FindBy(linkText="Click Here")
	WebElement ClickHere;
	public String window()
	{
		MultipleWindowLink.click();
		ClickHere.click();
		//String Url=driver.getCurrentUrl();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		//System.out.println(driver.getWindowHandles());
		String childWindowUrl=driver.getCurrentUrl();
		return childWindowUrl;
		
		
	}

}
