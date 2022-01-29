package com.atypon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.atypon.base.TestBase;

public class DropdownPage extends TestBase {
	public DropdownPage()
	 {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="dropdown")
	 WebElement Dropdown;

	
	 @FindBy(linkText="Dropdown")
	    WebElement DropDownLink;
	 
	public  void SelectDropDown(int index) {
		  DropDownLink.click();
		  Select drop=new Select(Dropdown);
		  drop.selectByIndex(index);
	    
	}

}
