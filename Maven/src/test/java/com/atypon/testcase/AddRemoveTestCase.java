package com.atypon.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.AddRemovePage;

public class AddRemoveTestCase extends TestBase {
	AddRemovePage addRemovePage;
	
	public AddRemoveTestCase(){
		super();
}
	@Test(priority=1)
	public  void AddRemoveButton()
	{
		addRemovePage=new AddRemovePage();
		addRemovePage.AddinLinks();
		addRemovePage.AddOnButton();
		addRemovePage.AddOnDelete();
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
	
	

}
