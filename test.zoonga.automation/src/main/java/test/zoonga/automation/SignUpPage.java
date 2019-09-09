package test.zoonga.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[text()='Sign Up']") 
	public WebElement lnkSignup;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement txtLastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement txtPassword;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	

}
