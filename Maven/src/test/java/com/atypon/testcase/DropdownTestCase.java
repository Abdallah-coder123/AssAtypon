package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.CheckBoxPage;
import com.atypon.page.DropdownPage;

public class DropdownTestCase  extends TestBase{

	public DropdownTestCase() {
		// TODO Auto-generated constructor stub
	super();
	}
	DropdownPage dropdown;
	@Test(priority=3)
	public void Selected() 
		{
		dropdown=new DropdownPage();
		
			dropdown.SelectDropDown(1);		

		}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
