package com.att.att;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_id {
WebDriver driver;
	
	public   create_id(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath ="//*[text()=\"Cancel\"]") 
	WebElement Cancel;
	
	@FindBy(xpath ="//*[text()=\"Close\"]") 
	WebElement close;
	
	@FindBy(id ="createNow") 
	WebElement create;
	
	public void Cancel() {
		Cancel.click();
	}
	public void close() {
		close.click();
	}
	public void create() {
		 create.click();
	}
}





