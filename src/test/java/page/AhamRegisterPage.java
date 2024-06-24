package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AhamRegisterPage {
	WebDriver driver;
	By registerLink = By.id("customer_register_link");
	By firstNameLink = By.id("FirstName");
	By lastNameLink = By.id("LastName");
	By emailregLink = By.id("Email");
	By passwordLink = By.name("customer[password]");
	By createSubmit = By.xpath("//*[@id=\"create_customer\"]/p/input");

	public AhamRegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setRegisterValues(String firstname, String lastname, String emailreg, String passwrdreg) {
		driver.findElement(firstNameLink).sendKeys(firstname);
		driver.findElement(lastNameLink).sendKeys(lastname);
		driver.findElement(emailregLink).sendKeys(emailreg);
		driver.findElement(passwordLink).sendKeys(passwrdreg);

	}

	public void createSubmitbutton() {
		driver.findElement(createSubmit).click();
	}
}
