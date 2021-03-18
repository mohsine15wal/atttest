package com.att.att;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;

	public  homePage(WebDriver driver){

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath ="//input[@id='z1-searchfield']") 
	WebElement searchBar;

	@FindBy(xpath ="//*[text()=\"COVID-19 AT&T Online Support\"]") 
	WebElement searchBarsugg1;

	@FindBy(xpath ="//*[text()=\"Upgrade a device\"]") 
	WebElement searchBarsugg2;

	@FindBy(xpath ="//*[text()=\"TV & internet bundles\"]") 
	WebElement searchBarsugg3;

	@FindBy(xpath ="//*[text()=\"Unlimited plans\"]") 
	WebElement searchBarsugg4;

	@FindBy(xpath ="(//*[text()=\"AT&T PREPAID\"])[1]") 
	WebElement searchBarsugg5;


	public void searchBar() {
		searchBar.click();
	}
	public void searchBarsugg1() {
		searchBarsugg1.click();
	}
	public void searchBarsugg2() {
		searchBarsugg2.click();
	}
	public void  searchBarsugg3() {
		searchBarsugg3.click();
	}
	public void  searchBarsugg4() {
		searchBarsugg4.click();
	}
	public void  searchBarsugg5() {
		searchBarsugg5.click();
	}
}
















