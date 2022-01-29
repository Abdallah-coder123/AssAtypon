package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class nestedFramesPage extends TestBase{

	public nestedFramesPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Nested Frames")
	WebElement FramesLinks;
	
	@FindBy(id="content")
	WebElement Content;
	
	
	public String HandelFrames()
	{
		FramesLinks.click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(Content.getText());
		return Content.getText();
	}

}
