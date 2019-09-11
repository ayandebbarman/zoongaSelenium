package test.zoonga.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TicketPage {
	
	private WebDriver driver;
	

	@FindBy(xpath = "//h4[text()='Windies Women v Australia Women, 2nd T20I']/../..//button[text()='Buy Tickets']")
	public WebElement btnBuyTickets;
	
	@FindBy(xpath = "//text[text()='205']")
	public WebElement txtSeat;
	
	@FindBy(xpath = "//*[name()='svg']//*[name()='textPath' and text()='105']")
	public WebElement svgSeats105;
	
	@FindBy(xpath = "//input[@aria-label='Ticket Quantity']")
	public WebElement txtSeatsQuantity;
	
	@FindBy(xpath = "//a[text()='+']")
	public WebElement btnPlus;
	
	@FindBy(xpath = "//a[text()='Continue']")
	public WebElement btnContinue;
	
	
	
	public TicketPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
