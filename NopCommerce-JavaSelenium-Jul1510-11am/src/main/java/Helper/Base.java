package Helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public String propath= ".//src//main//resources//Common//property.properties";
	public String browser = "browser";
	public String browsername1= "chrome";
	public String browsername2 = "firefox";
	public String chpath = "chromepath";
	public String ffpath = "ffpath";
	public String sspath = "screenshotpath";
	public String tdPath = "tdpath";
	public static WebDriver driver;
	public String url = "url";
	public String min_wait = "min_wait";
	public ChromeOptions options = new ChromeOptions();
	public FirefoxOptions option = new FirefoxOptions();
	public String chromepath="chromepath";

	public FileInputStream fis;
	
	public String getProperty(String name) throws IOException {
		this.fis = new FileInputStream(this.propath);
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(name);	
	}
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  String browser = this.getProperty(this.browser);
	  if(browser.equals(browsername1)) {
		  this.options.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver",this.getProperty(this.chromepath));
		  driver = new ChromeDriver();
	  }
	  else if(browser.equals(browsername2)) {
		  this.option.addPreference("dom.webnotifications.enabled", false);
		  System.setProperty("webdriver.gecko.driver", this.getProperty(this.ffpath));
		  driver = new FirefoxDriver(this.option);
	  }
	  driver.get(getProperty("url"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Integer.parseInt(this.getProperty(this.min_wait)), TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  
	driver.quit();
  }
  
  public void takeScreenshot(String name) throws IOException {
	EventFiringWebDriver ef = new EventFiringWebDriver(driver);
	File f1 = ef.getScreenshotAs(OutputType.FILE);
	File f2 = new File(this.getProperty(this.sspath)+name+".png");
	FileUtils.copyFile(f1, f2);
  }
  public String getData(String sheetname, int r, int c) throws IOException, IOException {
	  this.fis= new FileInputStream(this.getProperty(this.tdPath));
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet=	wb.getSheet(sheetname);
	  XSSFRow row = sheet.getRow(r);
	  XSSFCell cell = row.getCell(c);
	  return cell.getStringCellValue();
  }
  public static String date(String date) {
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern(date);  
	   LocalDateTime now = LocalDateTime.now();  
	   return dtf.format(now);
  }
 public static void enter() throws AWTException {
	    Robot r1=new Robot(); 
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
    }
 public static void window(int window) {
	    Set<String> all =driver.getWindowHandles();
		List<String> all_window=new ArrayList(all);
		driver.switchTo().window(all_window.get(window));
 }
 public void waiting(int time) {
	 driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
 }

}