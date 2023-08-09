package AdminTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AdminDashBoardPage;
import POM.Catalog;
import POM.Registration;
import POM.Vendor;
import POM.addNewCustomers;
import POM.cart;
import POM.checkOutProtect;
import POM.payPal;
import POM.userLogin;
import Utility.utility;
import POM.logOut;
import POM.AdminLoginPage;


public class LoginTests extends Base{
	public String sheetname = "sheetname";
	public String sheet="sheet";
	@Test
	public void verifyAdminIsLoginWithValidCred() throws IOException, InterruptedException {
		utility util = new utility();
		util.adminLogin(this.getProperty("username"), getProperty("registerUserName"));
		AdminDashBoardPage adp = PageFactory.initElements(driver, AdminDashBoardPage.class);
		userLogin log =PageFactory.initElements(driver,userLogin.class);
		boolean actual = log.getNopNews().isDisplayed();
		AssertJUnit.assertTrue(actual);
	}
	@Test
	public void verifyWithUserCanRegister() throws IOException {
		driver.get(getProperty("registrationUrl"));
		utility util =new utility();
		util.registration(getData((getProperty("sheet")),1,1),getData((getProperty("sheet")),2,1),
				getData((getProperty("sheet")),4,1),
				getData((getProperty("sheet")),5,1),getData((getProperty("sheet")),3,1));
		Registration register=PageFactory.initElements(driver,Registration.class);
		boolean cfn =register.getRegisterMsg().isDisplayed();
		AssertJUnit.assertTrue(cfn);
	}
	@Test
	public void toValiateUserCanLogInWithInValidcreds() throws IOException, InterruptedException {
		utility util =new utility();
		util.adminLogin(getData(getProperty("sheet"),2,0),getData(getProperty("sheet"),2,1));
		userLogin log =PageFactory.initElements(driver,userLogin.class);
		boolean news =log.getLogerrmsg().isDisplayed();
		AssertJUnit.assertTrue(news);
	}
	@Test
	public void  userCanAbleCheckTheAvailableUserName() throws IOException {
		driver.get(getProperty("registrationUrl"));
		Registration register =PageFactory.initElements(driver,Registration.class);
		register.getRegusername().sendKeys(getData(getProperty("sheet"),8,1));
		register.getChechAvailableUserName().click();
		boolean avilableText=register.getAvailabeUserNameText().isDisplayed();
		AssertJUnit.assertFalse(avilableText);
	}
	@Test
	public void registrationWithOutMandatoryFilds() throws IOException {

		driver.get(getProperty("registrationUrl"));
		Registration register =PageFactory.initElements(driver,Registration.class);
		utility util =new utility();
		util.registration(getData(getProperty("sheet"),1,1),getData(getProperty("sheet"),2,1),
				getData(getProperty("sheet"),5,0),getData(getProperty("sheet"),3,0),
				getData(getProperty("sheet"),3,1));
		register.getComid().sendKeys(getData(getProperty("sheet"),6,1));
		register.getMainAcitivity().sendKeys(getData(getProperty("sheet"),7,1));
		register.getRegisterbtn().click();
		boolean eremsg=	register.getErrormsg().isDisplayed();
		AssertJUnit.assertTrue(eremsg);
	}
	@Test
	public void checkTheaddprodectToCartWithoutRegistration() throws IOException, AWTException {
		driver.get(getProperty("regurl"));
		checkOutProtect check =PageFactory.initElements(driver,checkOutProtect.class);
		check.getRegDownload().click();
		waiting(5);
		check.getMarketPlace().click();
		check.getMarketSearchBox().sendKeys(getProperty("book"));
		enter();
		check.getZohoBook().click();
		check.getExtensons().click();
		window(1);
		boolean ch=check.getRegisterPagetext().isDisplayed();
		AssertJUnit.assertTrue(ch);

	}
	@Test
	public void validateIsAbleToSelectCurrentDateInAddNewCustamorPage() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		utility util=new utility();
		util.addNewCustamor(getData(getProperty("sheet"),4,1), getData(getProperty("sheet"),3,1),
				getData(getProperty("sheet"),1,1),getData(getProperty("sheet"),2,1),
				getData(getProperty("sheet"),6,0));
		addNewCustomers customer=PageFactory.initElements(driver,addNewCustomers.class);
		customer.getCusCalender().clear();
		customer.getCusCalender().sendKeys(date("dd/MM/yyyy"));
		customer.getSaveNtn().click();
		boolean date=customer.getMsg().isDisplayed();
		AssertJUnit.assertTrue(date);

	}
	@Test
	public void userCanCreateTheNewCustomerWithExistingEmailId() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		utility util=new utility();
		util.addNewCustamor(getData(getProperty("sheet"),11,0), getData(getProperty("sheet"),3,1),
				getData(getProperty("sheet"),1,1),getData(getProperty("sheet"),2,1),
				getData(getProperty("sheet"),6,0));
		addNewCustomers customer=PageFactory.initElements(driver,addNewCustomers.class);
		String user=customer.getCusEmail().getText();
		customer.getSaveNtn().click();
		boolean success=customer.getMsg().isDisplayed();
		AssertJUnit.assertTrue(success);
	}

	@Test
	public void userCanSeeTheOrdersInDashBoardBage() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		AdminDashBoardPage page =PageFactory.initElements(driver,AdminDashBoardPage.class);
		page.getOrder().click();
		boolean flag =page.getOrderPlus().isDisplayed();
		AssertJUnit.assertTrue(flag);

	}
	@Test
	public void userCanLinkWithPaypalAccountWithoutRegistration() throws IOException {
		driver.get(getProperty("regurl"));

		checkOutProtect check=PageFactory.initElements(driver,checkOutProtect.class);
		check.getRegDownload().click();
		check.getMarketPlace().click();
		payPal pay =PageFactory.initElements(driver,payPal.class);
		pay.getClickextensons().click();
		pay.getPayin().click();
		pay.getPatexten().click();
		boolean tag =pay.getSignup().isDisplayed();
		AssertJUnit.assertTrue(tag);
	}
	@Test
	public void tryToSeeCartprotectWithoutRegister() throws IOException {
		driver.get(getProperty("regurl"));
		cart cart=PageFactory.initElements(driver,cart.class);
		cart.getShoplogo().click();
		boolean logo=cart.getNoData().isDisplayed();
		AssertJUnit.assertTrue(logo);
	}

	@Test
	public void tryToGiveTheInvalidInputsInCustomerDateofBirth() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		utility util=new utility();
		util.addNewCustamor(getData(getProperty("sheet"),4,1), getData(getProperty("sheet"),3,1),
				getData(getProperty("sheet"),1,1),getData(getProperty("sheet"),2,1),
				getData(getProperty("sheet"),6,0));
		addNewCustomers customer=PageFactory.initElements(driver,addNewCustomers.class);
		customer.getCusCalender().clear();
		customer.getCusCalender().sendKeys(getProperty("date"));
		customer.getSaveNtn().click();
		boolean date= customer.getMsg().isDisplayed();
		AssertJUnit.assertTrue(date);
	}
	@Test
	public void  userCanAbleSearchTheProtects() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		utility util = new utility();
		util.catalog(getData(getProperty("sheet"),10,0));
		Catalog cat = PageFactory.initElements(driver,Catalog.class);
		boolean pro= cat.getNotAvailabletxt().isDisplayed();
		AssertJUnit.assertTrue(pro);

	}

	@Test
	public void userCanAbleToAddNewProduct() throws IOException, InterruptedException {

		userCanAbleSearchTheProtects();
		Catalog cat = PageFactory.initElements(driver,Catalog.class);
		cat.getAddNewBtn().click();
		cat.getAddnewSerachBox().sendKeys(getData(getProperty("sheet"),10,0));
		cat.getSaveBtn().click();
		boolean msg= cat.getSuccessMsg().isDisplayed();
		AssertJUnit.assertTrue(msg);
	}
	@Test
	public void userCanSetTheNewVendor() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		utility util = new utility();
		util. Vendor(getData(getProperty("sheet"),1,1),getData(getProperty("sheet"),5,0));
		Vendor ven =PageFactory.initElements(driver,Vendor.class);
		boolean msg=ven.getVenErrMsg().isDisplayed();
		AssertJUnit.assertTrue(msg);
	}
	@Test
	public void userCanAbleToLogOut() throws IOException, InterruptedException {
		verifyAdminIsLoginWithValidCred();
		AdminLoginPage page=PageFactory.initElements(driver,AdminLoginPage.class);
		utility util = new utility();
		util.logOut();
		boolean log= page.getLoginBtn().isDisplayed();
		AssertJUnit.assertTrue(log);
	}

}