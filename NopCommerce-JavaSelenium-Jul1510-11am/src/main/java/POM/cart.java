package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cart {
	@FindBy (xpath="//a[@class='navigation-shopping-cart navigation-circle-tile']")
    WebElement shoplogo;
	
	public void setShoplogo(WebElement shoplogo) {
		this.shoplogo = shoplogo;
	}

	public void setNoData(WebElement noData) {
		this.noData = noData;
	}

	@FindBy(xpath="//div[@class='no-data']")
	WebElement noData;

	public WebElement getShoplogo() {
		return shoplogo;
	}

	public WebElement getNoData() {
		return noData;
	}
}
