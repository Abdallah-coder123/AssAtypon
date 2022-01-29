package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class InputPage extends TestBase{

	public InputPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Inputs")
	WebElement inputsLink;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement inputsNumber;
	
	public String SendNumber(int number)
	{
		this.inputsLink.click();
		for(int i=0;i<=number;i++)
		{
			inputsNumber.sendKeys(""+i);
			if(i==number)
				{
				return this.inputsNumber.getText();
				};
			inputsNumber.clear();
			
			
		}
		
		return "";		
	}
	
	
	
	
}
