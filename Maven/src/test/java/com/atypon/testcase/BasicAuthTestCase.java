package com.atypon.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.atypon.base.TestBase;
import com.atypon.page.BasicAuthPage;

public class BasicAuthTestCase extends TestBase {
	


BasicAuthPage basicAuthPage=new BasicAuthPage();
@Test(priority=19)

public void check() {
String TextBasicAuth= basicAuthPage.BasicAuth();
System.out.print(TextBasicAuth);
Assert.assertEquals("Congratulations! You must have the proper credentials.", TextBasicAuth);
}

@AfterClass
public void closeBrowser() {
    driver.quit();

}
}