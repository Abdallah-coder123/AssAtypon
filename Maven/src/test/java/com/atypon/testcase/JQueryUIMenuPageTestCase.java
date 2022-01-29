package com.atypon.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.JQueryUIMenuPage;

public class JQueryUIMenuPageTestCase extends TestBase{

	public JQueryUIMenuPageTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	JQueryUIMenuPage jQueryUIMenuPage;
	@Test(priority=22)
	public void  JQueryUIMenuPageTest() throws InterruptedException
	{
		jQueryUIMenuPage=new JQueryUIMenuPage();
		String CurrentUrl=jQueryUIMenuPage.JQueryUiMenu();
		Assert.assertEquals("http://the-internet.herokuapp.com/jqueryui",CurrentUrl);
		
	}

}
