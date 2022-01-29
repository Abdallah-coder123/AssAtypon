package com.atypon.page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class DragAndDropPage extends TestBase {

	public DragAndDropPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText="Drag and Drop")
	WebElement DragAndDropLinks;
	
	@FindBy(id="draggable")
	WebElement fromA;
	
	@FindBy(id="draggable")
	WebElement ToB;
	
	public void DragDrop()
	{
		DragAndDropLinks.click();
		Actions action = new Actions(driver);
		//action.dragAndDrop(fromA, ToB).perform();
		action.dragAndDrop(fromA, ToB).build().perform();
		

		
		//action.dragAndDropBy(fromA, 400, 0).perform();
		//action.clickAndHold(fromA).moveToElement(ToB).release().build().perform();

	}
	
	

}
