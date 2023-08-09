package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	@FindBy (xpath="//input[@name='FirstName']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@name='LastName']")
	WebElement lasttName;
	
	@FindBy (xpath="//input[@name='Email']")
	WebElement email;
	
	@FindBy (xpath="//span[@id='username-availabilty']")
	WebElement availabeUserNameText;
	 
	@FindBy (xpath="//h1[text()='Register']")
	WebElement registerMsg;
	
	public WebElement getRegisterMsg() {
		return registerMsg;
	}
	public void setRegisterMsg(WebElement registerMsg) {
		this.registerMsg = registerMsg;
	}
	public void setAvailabeUserNameText(WebElement availabeUserNameText) {
		this.availabeUserNameText = availabeUserNameText;
	}
	public WebElement getAvailabeUserNameText() {
		return availabeUserNameText;
	}

	@FindBy (xpath="//input[@name='ConfirmEmail']")
	WebElement cnfmemail;
	
	
	@FindBy (xpath="//input[@name='Username']")
	WebElement regusername;

	@FindBy (xpath="//input[@name='Password']")
	WebElement regpass;
	
	@FindBy (xpath="//input[@name='ConfirmPassword']")
	WebElement conpass;
	
	@FindBy (xpath="//select[@name='Details.CompanyRoleId']")
	WebElement mainAcitivity;
	
	@FindBy (xpath="//select[@name='Details.CompanySizeId']")
	WebElement comid;
	
	@FindBy (xpath="//input[@id='register-button']")
	WebElement registerbtn;
	
	@FindBy (xpath="//span[text()='The email and confirmation email do not match.']")
	WebElement errormsg;
	
	@FindBy (xpath="//input[@id='check-availability-button']")
	WebElement chechAvailableUserName;
	 
	public void setChechAvailableUserName(WebElement chechAvailableUserName) {
		this.chechAvailableUserName = chechAvailableUserName;
	}
	public WebElement getChechAvailableUserName() {
		return chechAvailableUserName;
	}
	public WebElement getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(WebElement errormsg) {
		this.errormsg = errormsg;
	}
	public WebElement getRegisterbtn() {
		return registerbtn;
	}

	public void setRegisterbtn(WebElement registerbtn) {
		this.registerbtn = registerbtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLasttName() {
		return lasttName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCnfmemail() {
		return cnfmemail;
	}

	public WebElement getRegusername() {
		return regusername;
	}

	public WebElement getRegpass() {
		return regpass;
	}

	public WebElement getConpass() {
		return conpass;
	}

	public WebElement getMainAcitivity() {
		return mainAcitivity;
	}

	public WebElement getComid() {
		return comid;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public void setLasttName(WebElement lasttName) {
		this.lasttName = lasttName;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public void setCnfmemail(WebElement cnfmemail) {
		this.cnfmemail = cnfmemail;
	}

	public void setRegusername(WebElement regusername) {
		this.regusername = regusername;
	}

	public void setRegpass(WebElement regpass) {
		this.regpass = regpass;
	}

	public void setConpass(WebElement conpass) {
		this.conpass = conpass;
	}

	public void setMainAcitivity(WebElement mainAcitivity) {
		this.mainAcitivity = mainAcitivity;
	}

	public void setComid(WebElement comid) {
		this.comid = comid;
	}

	
	


}
