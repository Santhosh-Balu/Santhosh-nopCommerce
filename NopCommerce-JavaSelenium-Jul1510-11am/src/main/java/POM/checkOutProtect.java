package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkOutProtect {
	@FindBy(xpath="//span[text()='Downloads']")
	WebElement regDownload;
    
	@FindBy(xpath="//a[@class='navigation-top-menu-link']//span[text()='Marketplace']")
	WebElement marketPlace;
	
	@FindBy(xpath="//input[@placeholder='Search extensions']")
	WebElement marketSearchBox;
	
	@FindBy(xpath="//a[text()='Zoho Books Integration (Atluz)']")
	WebElement zohoBook;
	
	@FindBy(xpath="//a[text()='Get extension']")
	WebElement extensons;
	
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']")
	WebElement registerPagetext;

	public WebElement getRegDownload() {
		return regDownload;
	}

	public WebElement getMarketPlace() {
		return marketPlace;
	}

	public WebElement getMarketSearchBox() {
		return marketSearchBox;
	}

	public WebElement getZohoBook() {
		return zohoBook;
	}

	public WebElement getExtensons() {
		return extensons;
	}

	public WebElement getRegisterPagetext() {
		return registerPagetext;
	}

	public void setRegDownload(WebElement regDownload) {
		this.regDownload = regDownload;
	}

	public void setMarketPlace(WebElement marketPlace) {
		this.marketPlace = marketPlace;
	}

	public void setMarketSearchBox(WebElement marketSearchBox) {
		this.marketSearchBox = marketSearchBox;
	}

	public void setZohoBook(WebElement zohoBook) {
		this.zohoBook = zohoBook;
	}

	public void setExtensons(WebElement extensons) {
		this.extensons = extensons;
	}

	public void setRegisterPagetext(WebElement registerPagetext) {
		this.registerPagetext = registerPagetext;
	}
	
	
	
	

}
