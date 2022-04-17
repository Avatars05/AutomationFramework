package Master.E2E_Project;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.io.IOException; //all functionality

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import PageObject.Branchtypes;
import PageObject.Landingpage;
import Resources.Base;



public class LoginPage extends Base // Inheritance - extends the base class
{
	public static Logger log=LogManager.getLogger(Base.class.getName());
				
	public WebDriver driver;   //declare webdriver in local alway to avoid overriden while parrel exceuction of test  //assign driver to local copy -will not affect 
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		log.info("driver intialized");
		driver.get(prop.getProperty("URL"));
		log.info("url launchedd");
		
	}

	@Test(dataProvider = "getdata")
	public void basepage_navigation(String username, String password) throws IOException {

		driver.manage().window().maximize();

		// creating objects
		Landingpage lp = new Landingpage(driver); // while passing the any arguments while creating object- constructor	need to be created										// need tp be created
		lp.username().sendKeys(username);
		//logger("username is addedd");
		
		lp.key().sendKeys(password);
		//logger("password");
		
		lp.login().click();
	   //log.info("clicked the login button");

		Branchtypes hp = new Branchtypes(driver);
		hp.click_branch().click();
		
	}

	@DataProvider
	public Object[][] getdata() // 0= email 1=password
	{
		Object[][] data = new Object[1][2]; // row no should be -no of datatype (email & password) coulum should no of
											// value( credentials) we passing
		data[0][0] = "Unkonwn_Avatar@sharklasers.com";
		data[0][1] = "Admin@123";

		/*
		 * data[1][0]="Unkonwn_Avatar@sharklasers.com"; data[1][1]="Admin@12";
		 * 
		 * data[2][0]="Unkonwn_Avatar@sharklasers.com"; data[2][1]="Admin@123";
		 */

		return data;
	}

	@AfterTest
	public void teardown() 
	{
		//driver.close();
	}
}