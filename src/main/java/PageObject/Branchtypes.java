package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Branchtypes {
	
	
	WebDriver driver; //dummy driver
	public Branchtypes(WebDriver driver)  //Concept constructor - life of driver in this only
	{
		this.driver=driver;   // dummy sriver using assigning the driver which has the chromedriver to this dumy drivver using thiskeyword
		PageFactory.initElements(driver, this); //initialize pageobject facotry method
	}
	
	@FindBy(xpath="//p[normalize-space()='Branch Types']")
	WebElement Branchtyp;
	
 
	public WebElement click_branch() 
	{
		return Branchtyp;
	}
} 