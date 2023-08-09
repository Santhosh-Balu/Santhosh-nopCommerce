package Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Helper.Base;
import POM.AdminLoginPage;
import POM.Catalog;
import POM.Registration;
import POM.addNewCustomers;
import POM.logOut;
import POM.userLogin;
import POM.Vendor;
public class utility extends Base{

	
	public void adminLogin(String username, String pwd) throws InterruptedException {
		AdminLoginPage alp = PageFactory.initElements(driver, AdminLoginPage.class);
		alp.getEmailIdTxtBx().clear();
		alp.getEmailIdTxtBx().sendKeys(username);
		Thread.sleep(3000);
		alp.getPwdTxtBx().clear();
		alp.getPwdTxtBx().sendKeys(pwd);
		alp.getLoginBtn().click();
	}
	public void registration(String first,String last,String mail,String usernmae,String pass) throws IOException {
	     
		Registration register = PageFactory.initElements(driver,Registration.class);
		
		register.getFirstName().sendKeys(first);
		register.getLasttName().sendKeys(last);
		register.getComid().sendKeys(mail);
		register.getCnfmemail().sendKeys(mail);
		register.getRegusername().sendKeys(usernmae);
		register.getRegpass().sendKeys(pass);
		Select select = new Select(register.getComid());
		select.selectByVisibleText(getData(getProperty("sheet"),6,1));
		Select select2 = new Select(register.getMainAcitivity());
		select2.selectByVisibleText(getData(getProperty("sheet"),7,1));
		register.getRegisterbtn().click();
	
}
	public void loginFailed(String name ,String pass) throws IOException {
		userLogin log =PageFactory.initElements(driver,userLogin.class);
		
		log.getLogusername().clear();
		log.getLogusername().sendKeys(name);
		log.getLogpassword().clear();
		log.getLogpassword().sendKeys(pass);
		log.getClickbtn().click();
		
	}
	public void addNewCustamor(String email,String pass,String first,String last,String comname) throws IOException {
		addNewCustomers customer=PageFactory.initElements(driver,addNewCustomers.class);
		customer.getCustomers1().click();
		customer.getCustomersIn().click();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(this.getProperty(this.min_wait)), TimeUnit.SECONDS);
		customer.getAddNewBtn().click();
		customer.getCusEmail().sendKeys(email);
		customer.getCusPass().sendKeys(pass);
		customer.getCusFirstName().sendKeys(first);
		customer.getCusLastName().sendKeys(last);
		customer.getCompanyName().sendKeys(comname);
		customer.getTaxCheckBox().click();
		customer.getActiveCheckBox().click();
		String Gender =getProperty("gender");
		if(Gender.equals("male")) {
			customer.getCusMale().click();
		}
		else {
			customer.getCusFeMale().click();
		}
		customer.getCusCalender().sendKeys(getProperty("DOB"));
		customer.getRegis();
		
		
		/*
		customer.getCusEmail().sendKeys(getData(getProperty("sheet"),4,1));
		customer.getCusPass().sendKeys(getData(getProperty("sheet"),3,1));
		customer.getCusFirstName().sendKeys(getData(getProperty("sheet"),1,1));
		customer.getCusLastName().sendKeys(getData(getProperty("sheet"),2,1));
		customer.getCompanyName().sendKeys(getData(getProperty("sheet"),6,0));
		 */
	}
	public void catalog(String protect) {
		
		  Catalog log =PageFactory.initElements(driver,Catalog.class);
	       log.getCatalog().click();
	       log.getProtects().click();
	       log.getProtectSearch().clear();
	       log.getProtectSearch().sendKeys(protect);
	       log.getSearchbtn().click();
	}
	
	public void Vendor(String name,String mail) {
		Vendor ven =PageFactory.initElements(driver,Vendor.class);
		ven.getCustomer().click();
		ven.getVendor().click();
		ven.getAddNewVendor().click();
		ven.getVenMail().sendKeys(mail);
		ven.getVenname().sendKeys(name);
		ven.getVenSaveBtn().click();
		
	}
	public void logOut() {
		 logOut log =PageFactory.initElements(driver,logOut.class);
		  log.getLogout().click();
	}
	
}