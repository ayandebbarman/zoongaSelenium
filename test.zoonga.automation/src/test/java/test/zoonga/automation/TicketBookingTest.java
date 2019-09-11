package test.zoonga.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TicketBookingTest {
	
	private WebDriver driver;
	private TicketPage hPage;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoonga.com/australiatour");
		hPage = new TicketPage(driver);
		
	}
	@Test
	public void signUp() {
		
		hPage.btnBuyTickets.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hPage.svgSeats105.click();
		hPage.btnPlus.click();
		hPage.btnContinue.click();

//		hPage.txtSeatsQuantity.sendKeys("2");
//		hPage.txtSeatsQuantity.sendKeys(Keys.RETURN);
//		List<WebElement> availableSeats = driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and @id='Path']//*[name()='path' and @class='ticket-cat active']"));

	}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}

}
