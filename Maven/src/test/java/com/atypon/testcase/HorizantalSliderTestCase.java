package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.HorizontalSliderPage;

public class HorizantalSliderTestCase extends TestBase{

	public HorizantalSliderTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	HorizontalSliderPage horizantalSliderPage;
	@Test(priority=11)
	public void HorizantalSliderDragDrop()
	{
		horizantalSliderPage=new HorizontalSliderPage();
		String Range=horizantalSliderPage.DragSlider(1);
		Assert.assertEquals("2.5",Range);
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();

    }
	

}
