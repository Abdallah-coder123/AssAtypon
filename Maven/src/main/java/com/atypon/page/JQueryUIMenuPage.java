package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class JQueryUIMenuPage extends TestBase{

	public JQueryUIMenuPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	@FindBy (linkText="JQuery UI Menus")
	WebElement JQueryMenusLinks;
	@FindBy(xpath="//a[@id='ui-id-2']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
	WebElement Enabled;
	@FindBy(id="ui-id-5")
	WebElement subMenuOption;
	@FindBy(id="ui-id-4")
	WebElement Downloads;
	public String JQueryUiMenu() throws InterruptedException
	{
		JQueryMenusLinks.click();
		Actions actions = new Actions(driver);
    	actions.moveToElement(Enabled).perform();
   // actions.moveToElement(Downloads).perform();
    	Thread.sleep(2000);
        actions.moveToElement(Downloads).perform();
        Thread.sleep(2000);

    actions.moveToElement(subMenuOption).click();
    	subMenuOption.click();
    	String CurrentUrl=driver.getCurrentUrl();
    	return CurrentUrl;

	}

}
