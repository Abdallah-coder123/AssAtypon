package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class TyposPage extends TestBase{

	public TyposPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="p:nth-child(3)")
	WebElement Text;
	@FindBy(linkText="Typos")
	WebElement TyposLink;
	
	
	public String CheckSpelling() throws InterruptedException
	{
		TyposLink.click();
		String Testtext=Text.getText();
		String lastWord = Testtext.substring(Testtext.lastIndexOf(" ")+1);
		System.out.println(lastWord);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		String lastWord2 = Testtext.substring(Testtext.lastIndexOf(" ")+1);
		return lastWord2;
	}

}
