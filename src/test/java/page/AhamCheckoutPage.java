package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AhamCheckoutPage {
	WebDriver driver;
//checkout fields
	By checkoutCartLink = By.xpath("//*[@id=\"cart-link\"]/span/svg");
	By firstnameCheckout = By.xpath("//*[@id=\"TextField0\"]");
	By lastnameCheckout = By.xpath("//*[@id=\"TextField1\"]");
	By addressCheckout = By.xpath("//*[@id=\"TextField2\"]");
	By apartmentCheckout = By.xpath("//*[@id=\"TextField3\"]");
	By cityCheckout = By.xpath("//*[@id=\"TextField4\"]");
	By pincodeCheckout = By.xpath("//*[@id=\"TextField5\"]");
	By phonenoCheckout = By.xpath("//*[@id=\"TextField6\"]");

	By logoutCheckout = By.id("customer_logout_link");

	public AhamCheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void carticonCheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(checkoutCartLink).click();
		
	}

	public void checkout(String firstname, String lastname, String addresscheck, String apartmentcheck, String city,
			String pincode, String phoneno) {
		driver.findElement(firstnameCheckout).sendKeys(firstname);
		driver.findElement(lastnameCheckout).sendKeys(lastname);
		driver.findElement(addressCheckout).sendKeys(addresscheck);
		driver.findElement(apartmentCheckout).sendKeys(apartmentcheck);
		driver.findElement(cityCheckout).sendKeys(city);
		driver.findElement(pincodeCheckout).sendKeys(pincode);
		driver.findElement(phonenoCheckout).sendKeys(phoneno);
		driver.navigate().back();
	}

	public void checkoutlogout() {
		driver.findElement(logoutCheckout).click();
	}
}
