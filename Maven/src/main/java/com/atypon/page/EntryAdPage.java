package com.atypon.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class EntryAdPage extends TestBase {

	public EntryAdPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Entry Ad")
	WebElement EntryAdLinks;
	
	@FindBy(xpath="//p[normalize-space()='Close']")
	WebElement PopupClose;
	@FindBy(id="restart-ad")
	WebElement ClickHere;
	
	public void EntryAdCheck() throws InterruptedException
	{
		EntryAdLinks.click();
		Thread.sleep(2000);
		
//		Set<String> wnd = driver.getWindowHandles();
	      // window handles iteration
//	      Iterator<String> windows = wnd.iterator();
//	      String CurrentWindow = windows.next();
//	      String NextWindow = windows.next();
//	      driver.switchTo().window(NextWindow);
		PopupClose.click();
	    //  System.out.println("Page title of popup: "+ driver.getTitle());
	      // closes pop up window
	      ClickHere.click();
	      Thread.sleep(2000);
	      PopupClose.click();
	}

}
