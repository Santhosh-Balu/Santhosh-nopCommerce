package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class addNewCustomers {
	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	WebElement Customers1;
	
	@FindBy(xpath="//i[@class='nav-icon far fa-dot-circle']//following::p[text()=' Customers']")
	WebElement CustomersIn;

	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addNewBtn;
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement cusEmail;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement cusPass;
	
	@FindBy(css="input#FirstName")
	WebElement cusFirstName;
	
	@FindBy(css="input#LastName")
	WebElement cusLastName;
	
	@FindBy(css="input#Gender_Male")
	WebElement cusMale;
	
	@FindBy(xpath="(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")
	WebElement regis;
	
	public void setRegis(WebElement regis) {
		Select s=new Select(regis);
		s.selectByIndex(2);
		this.regis = regis;
	}

	public WebElement getRegis() {
		return regis;
	}

	@FindBy(css="input#Gender_Female")
	WebElement cusFeMale;
	
	@FindBy (xpath="//input[@id='DateOfBirth']")
	WebElement cusCalender;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	  
	@FindBy(xpath="//td[text()='santhosh@gmail.com']")
	WebElement sandytxt;
	
	public WebElement getSandytxt() {
		return sandytxt;
	}

	@FindBy(xpath="(//input[@class='check-box'])[1]")
	WebElement  taxCheckBox;
	
	@FindBy (xpath="(//input[@class='check-box'])[2]")
	WebElement activeCheckBox;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement saveNtn;
	
	@FindBy (xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement susMsg;
	
	@FindBy(xpath="//div[@class='validation-summary-errors']")
	WebElement Msg;

	public void setMsg(WebElement msg) {
		Msg = msg;
	}

	public WebElement getMsg() {
		return Msg;
	}

	public void setSusMsg(WebElement susMsg) {
		this.susMsg = susMsg;
	}

	public WebElement getSusMsg() {
		return susMsg;
	}

	public void setCustomers1(WebElement customers1) {
		Customers1 = customers1;
	}

	public void setCustomersIn(WebElement customersIn) {
		CustomersIn = customersIn;
	}

	public void setAddNewBtn(WebElement addNewBtn) {
		this.addNewBtn = addNewBtn;
	}

	public void setCusEmail(WebElement cusEmail) {
		this.cusEmail = cusEmail;
	}

	public void setCusPass(WebElement cusPass) {
		this.cusPass = cusPass;
	}

	public void setCusFirstName(WebElement cusFirstName) {
		this.cusFirstName = cusFirstName;
	}

	public WebElement getCustomers1() {
		return Customers1;
	}

	public WebElement getCustomersIn() {
		return CustomersIn;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getCusEmail() {
		return cusEmail;
	}

	public WebElement getCusPass() {
		return cusPass;
	}

	public WebElement getCusFirstName() {
		return cusFirstName;
	}

	public WebElement getCusLastName() {
		return cusLastName;
	}

	public WebElement getCusMale() {
		return cusMale;
	}

	public WebElement getCusFeMale() {
		return cusFeMale;
	}

	public WebElement getCusCalender() {
		return cusCalender;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getTaxCheckBox() {
		return taxCheckBox;
	}

	public WebElement getActiveCheckBox() {
		return activeCheckBox;
	}

	public WebElement getSaveNtn() {
		return saveNtn;
	}

	public void setCusLastName(WebElement cusLastName) {
		this.cusLastName = cusLastName;
	}

	public void setCusMale(WebElement cusMale) {
		this.cusMale = cusMale;
	}

	public void setCusFeMale(WebElement cusFeMale) {
		this.cusFeMale = cusFeMale;
	}

	public void setCusCalender(WebElement cusCalender) {
		this.cusCalender = cusCalender;
	}

	public void setCompanyName(WebElement companyName) {
		this.companyName = companyName;
	}

	public void setTaxCheckBox(WebElement taxCheckBox) {
		this.taxCheckBox = taxCheckBox;
	}

	public void setActiveCheckBox(WebElement activeCheckBox) {
		this.activeCheckBox = activeCheckBox;
	}

	public void setSaveNtn(WebElement saveNtn) {
		this.saveNtn = saveNtn;
	}
	
}
