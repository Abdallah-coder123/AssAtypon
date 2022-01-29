package com.atypon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class DisappearingElementsPage extends TestBase {

	public DisappearingElementsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText="Disappearing Elements")
	WebElement DisappearingElementsLinks;
	
	@FindBy(linkText="Gallery")
	WebElement Gallery;
	
	public boolean DisappearingElements() throws InterruptedException 
	{
		DisappearingElementsLinks.click();

		int NumberOfLinks=driver.findElements(By.tagName("li")).size();
		System.out.println(NumberOfLinks);

		if (this.Gallery.isDisplayed())
		{
			System.out.println("yes");
			return true;

		}
	

		System.out.println(NumberOfLinks);
		return false;
		

	}
}
