package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.NotificationMessagesPage;

public class NotificationMessageTestCase extends TestBase {

	public NotificationMessageTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	NotificationMessagesPage NotificationMessage=new NotificationMessagesPage();
	
	@Test(priority=17)
	public void NotificationTestCase()
	{
		String []MsgNotification=NotificationMessage.Notification();
		String ActionSuccessful=MsgNotification[0];
//		Action Successful.substring(0, 16);
		System.out.println(ActionSuccessful.substring(0, 17));
		Assert.assertEquals( ActionSuccessful.substring(0, 18),"Action successful");
		
		String ActionUnSuccessful=MsgNotification[1];
	//	ActionUnSuccessful.substring(0, 18);
		System.out.println(ActionUnSuccessful.substring(0, 36));
		Assert.assertEquals( ActionUnSuccessful.substring(0, 36),"\"Action unsuccesful, please try again\"");
		
	}
	
	@AfterClass
    public void closeBrowser() {
        driver.quit();
    }
	

}
