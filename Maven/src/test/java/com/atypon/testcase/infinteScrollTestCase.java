package com.atypon.testcase;

import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.infiniteScrolling;

public class infinteScrollTestCase extends TestBase{

	public infinteScrollTestCase() {
		// TODO Auto-generated constructor stub
		super();
	}
	infiniteScrolling infinteScroll;
	@Test(priority=24)
	public void infiniteScrollingTestCase()
	{
		infinteScroll=new infiniteScrolling();
		infinteScroll.infinte();
		
	}
	
	

}
