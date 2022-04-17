package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {   //only xpath
	
	WebDriver driver; //dummy driver
	public Landingpage(WebDriver driver)  //Concept constructor - life of driver in this only
	{
		this.driver=driver;   // dummy sriver using assigning the driver which has the chromedriver to this dumy drivver using thiskeyword
		PageFactory.initElements(driver, this); //initialize pageobject facotry method
	}
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement SignIN;
 
	public WebElement username() 
	{
		return email ; // return to testcases and we are return webelement
	}
	public WebElement key()
	{
	return password;	
    }
	public WebElement login()
	{
	return SignIN;	
    }
}	
