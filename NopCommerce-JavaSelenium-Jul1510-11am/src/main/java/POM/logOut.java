package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logOut {
	@FindBy (linkText="Logout")
	WebElement logout;
	 


	public WebElement getLogout() {
		return logout;
	}
}