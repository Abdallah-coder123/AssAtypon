package com.atypon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atypon.base.TestBase;

public class AddRemovePage   extends TestBase {
	public AddRemovePage() {
				PageFactory.initElements(driver, this);
				}
	//Delete
			    @FindBy(linkText="Add/Remove Elements")
			    WebElement AddRemoveLink;

				@FindBy(xpath="//button[text()='Add Element']")
				WebElement AddButton;
				
				@FindBy(css=(".added-manually"))
				WebElement DeleteButton;
				
		   public void AddinLinks()
		  { 
			   AddRemoveLink.click();
			   
		  }
		   public void AddOnButton()
		    {
			   for(int i=0;i<2;i++)
			   {
				   AddButton.click();
			   }
				  
				   
			  }
		   public void AddOnDelete()
		    {
			   for(int i=0;i<2;i++)
			   {
				   DeleteButton.click();
			   }
				  
				   
			  }
		   
	
}
