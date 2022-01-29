package com.atypon.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class ContextMenuPage extends TestBase {

	public ContextMenuPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="hot-spot")
	WebElement box;
	@FindBy(linkText="Context Menu")
	WebElement ContextMenuLink;
	
	public void ContextMenu()
	{
		ContextMenuLink.click();
		Actions actions = new Actions(driver);

		actions.contextClick(box).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();

		
		

	}


}
