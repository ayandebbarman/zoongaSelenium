package test.zoonga.automation;

import java.util.List;

import org.openqa.selenium.By;
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
		driver.get("https://www.zoonga.com/australiatour");
		driver.manage().window().maximize();
		hPage = new TicketPage(driver);
		
	}
	@Test
	public void signUp() {
		
		hPage.btnBuyTickets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'google')]")));
		//List<WebElement> availableSeats = driver.findElements(By.xpath("//path[contains(@class,'active')]/.."));
		WebElement svgA = driver.findElement(By.xpath("//*[local-name()='svg']//*[local- name()='g' and @id='Path']//*[local-name()='a' and @class='popper']"));
//		List<WebElement> availableSeats = driver.findElements(By.xpath("//svg//g[@id='Path']//a"));
//		System.out.println(availableSeats.size());
//		availableSeats.get(0).click();
//		hPage.txtSeat.click();
		svgA.click();
		
		System.out.println("hi");
	}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}

}
