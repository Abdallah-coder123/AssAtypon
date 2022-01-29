package com.atypon.testcase;

import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.EntryAdPage;

public class EntryAdTestCase extends TestBase {

	public EntryAdTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	EntryAdPage EntryAd;
	@Test(priority=24)
	public void EntryAdTest() throws InterruptedException
	{
		EntryAd=new EntryAdPage();
		EntryAd.EntryAdCheck();
	}
	

}
