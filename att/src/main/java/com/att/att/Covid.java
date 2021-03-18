package com.att.att;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Covid {
	
	
	WebDriver driver;
	
	public  Covid(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath ="//span[@class='ACCORDION_FAQ_PANEL2_0_i _3HPlK']") 
	WebElement Help_manage_your_account_online;
	
	@FindBy(xpath ="//*[text()=\"How can I manage my AT&T accounts online?\"]") 
	WebElement How_can_I_manage_my_ATT_accounts_online;

	@FindBy(xpath ="//span[@class='ACCORDION_FAQ_PANEL2_1_i _3HPlK']") 
	WebElement Support_first_responders;
	
	@FindBy(xpath ="//*[text()=\"Create an online account\"]") 
	WebElement cearte_an_account;
	
	public void Help_manage_your_account_online() {
		Help_manage_your_account_online.click();
	}
	
	public void How_can_I_manage_my_ATT_accounts_online() {
		How_can_I_manage_my_ATT_accounts_online.sendKeys(Keys.RETURN);
	}
	
	public void cearte_an_account() {
		cearte_an_account.sendKeys(Keys.RETURN);
		
	}
}
