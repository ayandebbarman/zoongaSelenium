package test.zoonga.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest {
	
	private WebDriver driver;
	private SignUpPage sPage;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayan\\eclipse-workspace\\test.zoonga.automation\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.zoonga.com");
		sPage = new SignUpPage(driver);
		
	}
	@Test
	public void signUp() {
		sPage.lnkSignup.click();
		sPage.txtFirstName.sendKeys("Ayan");
		sPage.txtLastName.sendKeys("Deb Barman");
		sPage.txtEmail.sendKeys("ayan.test@gmail.com");
		
		//Selecting Country Code
		Select phoneCode = new Select(driver.findElement(By.name("phoneCode")));
		
		phoneCode.selectByVisibleText("India (91)");
		
		sPage.txtPhoneNumber.sendKeys("912312345");
		sPage.txtPassword.sendKeys("test123");
		
//		System.out.println("hi");
	}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}
	

}
