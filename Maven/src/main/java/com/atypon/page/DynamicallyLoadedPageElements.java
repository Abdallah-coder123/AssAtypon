package com.atypon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.atypon.base.TestBase;

public class DynamicallyLoadedPageElements extends TestBase {

	public DynamicallyLoadedPageElements() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText="Dynamic Loading")
	WebElement DynamicLoadingLink;
	
	@FindBy(linkText="Example 1: Element on page that is hidden")
	WebElement DynamicLoadingHidden;

	@FindBy(xpath="//button[normalize-space()='Start']")
	WebElement ButtonStart;
	@FindBy(xpath="//h4[normalize-space()='Hello World!']")
	WebElement Text;
	

	public String DynamicLoading() throws InterruptedException
	{
		DynamicLoadingLink.click();
		DynamicLoadingHidden.click();
		ButtonStart.click();
//		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
		System.out.println(Text.getText());
		String TextAfterLoaded =Text.getText();
		return TextAfterLoaded;
		
		
	}

}
