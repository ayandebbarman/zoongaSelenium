package test.zoonga.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TicketBooking {
	
	private WebDriver driver;
	private TicketPage hPage;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayan\\eclipse-workspace\\test.zoonga.automation\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zoonga.com/australiatour");
		hPage = new TicketPage(driver);
		
	}
	@Test
	public void signUp() {
		
		hPage.btnBuyTickets.click();
		hPage.txtSeat.click();
		System.out.println("hi");
	}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}

}
