package com.atypon.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class infiniteScrolling extends TestBase {

	public infiniteScrolling() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText="Infinite Scroll")
	WebElement InfiniteScroll;
	public void infinte()
	{
		InfiniteScroll.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		long intialLength =  (Long) js.executeScript("return document.body.scrollHeight");
		 while(true){
	           js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	           try {
	               Thread.sleep(4000);
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	           long currentLength = (Long) js.executeScript("return document.body.scrollHeight");
	           if(intialLength == currentLength) {
	               break;
	           }
	           intialLength = currentLength;
	}

}
}
