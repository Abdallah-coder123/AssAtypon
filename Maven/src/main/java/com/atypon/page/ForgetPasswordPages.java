package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class ForgetPasswordPages extends TestBase {

	public ForgetPasswordPages() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText="Forgot Password")
	WebElement ForgetPasswordLink;
	
@FindBy(id="email")
WebElement Email;
@FindBy(id="form_submit")
WebElement Submit;

@FindBy(xpath="//h1[normalize-space()='Internal Server Error']")
WebElement InternalServerError;

public String enterEmail(String email){
	ForgetPasswordLink.click();
  Email.sendKeys(email);
  Submit.click();
  return InternalServerError.getText();
}



}
