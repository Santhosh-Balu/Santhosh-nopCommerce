package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class payPal {
	
	public void setPayPaling(WebElement payPaling) {
		this.payPaling = payPaling;
	}

	public void setPayin(WebElement payin) {
		this.payin = payin;
	}

	public void setPatexten(WebElement patexten) {
		this.patexten = patexten;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}

	public WebElement getPayPaling() {
		return payPaling;
	}

	public WebElement getPayin() {
		return payin;
	}

	public WebElement getPatexten() {
		return patexten;
	}

	public WebElement getSignup() {
		return signup;
	}

	@FindBy(xpath="//a[@title='Show details for PayPal Commerce (the official integration)']")
	WebElement payPaling;
	
	@FindBy(xpath="//img[@alt='Picture of PayPal Commerce (the official integration)']")
	WebElement payin;
	
	@FindBy(xpath="//a[text()='Get extension']")
	WebElement patexten;
	
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']")
	WebElement signup ;
	
	public void setClickextensons(WebElement clickextensons) {
		Clickextensons = clickextensons;
	}

	@FindBy(xpath="(//a[@class='inactive'])[2]")
	WebElement Clickextensons;

	public WebElement getClickextensons() {
		return Clickextensons;
	}

}
