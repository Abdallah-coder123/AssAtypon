package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class NotificationMessagesPage extends TestBase{

	public NotificationMessagesPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Notification Messages")
	WebElement NotificationMessagesLink;
	//Click here
	@FindBy(linkText="Click here")
	WebElement Clickhere;
	
	////div[@id='flash']
	@FindBy(xpath="//div[@id='flash']")
	WebElement NotificationMessage;
	
	@FindBy(linkText="Click here")
	WebElement ClickHere;
	
	public String[] Notification()
	{
		NotificationMessagesLink.click();
		String []Message=new String[2];
		Clickhere.click();
		
		Message[0]=NotificationMessage.getText();
		//System.out.println(ActionSuccessful);
		
		Clickhere.click();
		Message[1]=NotificationMessage.getText();
		//System.out.println(ActionUnsuccessful);
		return Message;	
	}

}
