package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AhamLoginPage {
	WebDriver driver;
	By emailField = By.id("CustomerEmail");
	By passwordField = By.id("CustomerPassword");
	By forgotPassLink = By.id("RecoverPassword");
	By signinSubmit = By.xpath("//*[@id=\"customer_login\"]/div/input");
	By customerRegisterLink = By.id("customer_register_link");

	public AhamLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setValues(String emailfield, String pass) {
		driver.findElement(emailField).sendKeys(emailfield);
		driver.findElement(passwordField).sendKeys(pass);

	}

	public void clickSignin() {
		driver.findElement(signinSubmit).click();
	}

	public void forgetpass() {
		driver.findElement(forgotPassLink).click();
	}

	public void createAccount() {
		driver.findElement(customerRegisterLink).click();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,200)");
	}

}
