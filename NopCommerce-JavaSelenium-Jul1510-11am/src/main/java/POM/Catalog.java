package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Catalog {
	@FindBy(xpath="//i[@class='nav-icon fas fa-book']")
	WebElement Catalog;
	
	@FindBy(xpath="//i[@class='nav-icon far fa-dot-circle']//following::p[text()=' Products']")
	WebElement protects ;

	@FindBy(xpath="//input[@name='SearchProductName']")
	WebElement protectSearch ;

	@FindBy(xpath="//button[@id='search-products']")
	WebElement searchbtn;
	
	@FindBy(xpath="//tr[@class='odd']")
	WebElement notAvailabletxt ;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addNewBtn;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement addnewSerachBox;


	@FindBy(xpath="//button[@name='save']")
	WebElement saveBtn;
	
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getAddnewSerachBox() {
		return addnewSerachBox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement successMsg;
	
	public WebElement getCatalog() {
		return Catalog;
	}

	public WebElement getProtects() {
		return protects;
	}

	public WebElement getProtectSearch() {
		return protectSearch;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getNotAvailabletxt() {
		return notAvailabletxt;
	}
}
