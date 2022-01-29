package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.CheckBoxPage;

public class CheckBoxTestCase extends TestBase {
	
	CheckBoxPage checkBoxPage;
	public CheckBoxTestCase()
	{
		super();
	}
	@Test(priority=2)
	public void isSelectedOrNot()
	{
		checkBoxPage=new CheckBoxPage();
		checkBoxPage.checkInCheckBox();
	}
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }

}
