package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.Base;

public class AdminDashBoardPage extends Base {

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DbTitle;

	public WebElement getDbTitle() {
		return DbTitle;
	}
	
	@FindBy(xpath="(//i[@class='fas fa-plus'])[3]")
	WebElement orderPlus;
	
	@FindBy(xpath="//button[@class='btn btn-tool margin-l-10']")
	WebElement order;

	public WebElement getOrderPlus() {
		return orderPlus;
	}

	public WebElement getOrder() {
		return order;
	}

	public void setDbTitle(WebElement dbTitle) {
		DbTitle = dbTitle;
	}

	public void setOrderPlus(WebElement orderPlus) {
		this.orderPlus = orderPlus;
	}

	public void setOrder(WebElement order) {
		this.order = order;
	} 
}
