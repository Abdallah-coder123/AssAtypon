package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.atypon.base.TestBase;

public class CheckBoxPage extends TestBase {

	public CheckBoxPage() {
		PageFactory.initElements(driver, this);
		}
	//Checkboxes
	 @FindBy(linkText="Checkboxes")
	    WebElement CheckboxesLink;
	 
	 @FindBy(xpath="//input[@type='checkbox'][1]")
		WebElement checkbox1;
	 
        @FindBy(xpath="//input[@type='checkbox'][2]")
		WebElement checkbox2;
	 
	 public void checkInCheckBox()
	 {
		 CheckboxesLink.click();
		  checkbox2.click();
		  checkbox1.click();
		  boolean check1IsSelectedOrNot=checkbox1.isSelected();
		  
		 Assert.assertEquals(true, check1IsSelectedOrNot);
		 Assert.assertEquals(false, checkbox2.isSelected());
		 
	 }
	 
	 
	 
}
