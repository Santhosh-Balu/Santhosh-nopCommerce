package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vendor {
	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	WebElement customer;
	
	@FindBy(xpath="//p[text()=' Vendors']")
	WebElement  vendor;
	
	@FindBy(xpath="//i[@class='fas fa-plus-square']")
	WebElement addNewVendor ;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement  venname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement  venMail;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement  venSaveBtn;
	
	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getVendor() {
		return vendor;
	}

	public WebElement getAddNewVendor() {
		return addNewVendor;
	}

	public WebElement getVenname() {
		return venname;
	}

	public WebElement getVenMail() {
		return venMail;
	}

	public WebElement getVenSaveBtn() {
		return venSaveBtn;
	}

	public WebElement getVenErrMsg() {
		return venErrMsg;
	}

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissable']")
	WebElement  venErrMsg;

}
