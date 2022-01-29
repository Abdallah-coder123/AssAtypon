package com.atypon.page;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class HorizontalSliderPage extends TestBase {

	public HorizontalSliderPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	//Horizontal Slider
	@FindBy(linkText="Horizontal Slider")
	WebElement HorizontalSliderLinks;
	
	@FindBy(xpath="//input[@value='0']")
			WebElement Slider;
	
	@FindBy(id="range")
	WebElement Range;
	
	public String DragSlider(int xOffset)
	{
		this.HorizontalSliderLinks.click();
		Actions act=new Actions(driver);
		act.dragAndDropBy(this.Slider, (int) xOffset, 0).perform();	
		return this.Range.getText();
	}
			
	

}
