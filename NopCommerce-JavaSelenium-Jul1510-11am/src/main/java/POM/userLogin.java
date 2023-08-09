package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userLogin {
	@FindBy(xpath="//input[@name='Email']")
	WebElement logusername;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement logpassword;
    
	@FindBy(xpath="//button[text()='Log in']")
	WebElement clickbtn;
	 
	@FindBy(xpath="//div[@id='nopcommerce-news-box']")
	WebElement nopNews;
	
	@FindBy (xpath="//span[text()='Wrong email']")
	WebElement logerrmsg;
	
	
	public WebElement getLogerrmsg() {
		return logerrmsg;
	}

	public void setLogerrmsg(WebElement logerrmsg) {
		this.logerrmsg = logerrmsg;
	}

	public WebElement getNopNews() {
		return nopNews;
	}
	
	public void setNopNews(WebElement nopNews) {
		this.nopNews=nopNews;
	}
	public WebElement getClickbtn() {
		return clickbtn;
	}
	public void setClickbtn( WebElement clickbtn) {
		this.clickbtn=clickbtn;
	}
	public WebElement getLogpassword() {
		return logpassword;
	}

	public void setLogpassword(WebElement logpassword) {
		this.logpassword = logpassword;
	}

	public void setLogusername(WebElement logusername) {
		this.logusername = logusername;
	}

	public WebElement getLogusername() {
		return logusername;
	}
	


}
