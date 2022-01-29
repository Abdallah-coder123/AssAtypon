package com.atypon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class HoverPage extends TestBase {

	public HoverPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//*[@alt='User Avatar'][1]")
		WebElement altImage;
	 
	 @FindBy(linkText="Hovers")
	    WebElement HoversLink;
	 
	 public void MouseHover()
	 {
		 HoversLink.click();
		 Actions action=new Actions(driver);
		 action.moveToElement(altImage).click().perform();;
		 
	 }
	 
	

	
}
