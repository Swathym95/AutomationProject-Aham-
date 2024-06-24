package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AhamHomePage {

	WebDriver driver;

	// body links
	// body image links section1
	By img1Sec1Link = By
			.xpath("//*[@id=\"shopify-section-168823f6-446a-471d-9979-c0558df4f5bb\"]/div/div/div/div[1]/div/a/div[2]/h3");
	By img2Sec1Link = By.xpath(
			"//*[@id=\"shopify-section-168823f6-446a-471d-9979-c0558df4f5bb\"]/div/div/div/div[2]/div/a/div[2]/h3");
	By img3Sec1Link = By
			.xpath("//*[@id=\"shopify-section-168823f6-446a-471d-9979-c0558df4f5bb\"]/div/div/div/div[3]/div/a/div[2]/h3");
	By img4Sec1Link = By
			.xpath("//*[@id=\"shopify-section-168823f6-446a-471d-9979-c0558df4f5bb\"]/div/div/div/div[4]/div/a/div[2]/h3");
	// body image links section 2
	By img1sec2Link = By
			.xpath("//*[@id=\"shopify-section-b5dd50ad-a121-4e67-b304-82a15c5e1096\"]/div/div/div/div[1]/div/a/div[2]/h3");
	By img2sec2Link = By
			.xpath("//*[@id=\"shopify-section-b5dd50ad-a121-4e67-b304-82a15c5e1096\"]/div/div/div/div[2]/div/a/div[2]/h3");
	By img3sec2Link = By
			.xpath("//*[@id=\"shopify-section-b5dd50ad-a121-4e67-b304-82a15c5e1096\"]/div/div/div/div[3]/div/a/div[2]/h3");
	By img4sec2Link = By
			.xpath("//*[@id=\"shopify-section-b5dd50ad-a121-4e67-b304-82a15c5e1096\"]/div/div/div/div[4]/div/a/div[2]/h3");
	// body shop saree image section 3
	// body featured products section 4 subsection 1
	By img1Sub1 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[1]/div/a/div[2]");
	By img2Sub1 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[2]/div/a/div[2]");
	By img3Sub1 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[3]/div/a/div[2]");
	By img4Sub1 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[4]/div/a/div[2]");
	// subsection 2
	By img1Sub2 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[5]/div/a/div[2]");
	By img2Sub2 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[6]/div/a/div[2]");
	By img3Sub2 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[7]/div/a/div[2]");
	By img4Sub2 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[8]/div/a/div[2]");
	// subsection 3
	By img1Sub3 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[9]/div/a/div[2]");
	By img2Sub3 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[10]/div/a/div[2]");
	By img3Sub3 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[11]/div/a/div[2]");
	By img4Sub3 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[12]/div/a/div[2]");
	// subsection 4
	By img1Sub4 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[13]/div/a/div[2]");
	By img2Sub4 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[14]/div/a/div[2]");
	By img3Sub4 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[14]/div/a/div[2]");
	By img4Sub4 = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[2]/div[16]/div/a/div[2]");
	By viewAllLink = By.xpath("//*[@id=\"shopify-section-1597031173550\"]/div/div[3]/a");
	// shop collections image links section 5
	By img1sec5 = By.xpath("//*[@id=\"shopify-section-1618886901395427e9\"]/div/div[2]/div/div[1]/div/a/div[2]/h3");
	By img2sec5 = By.xpath("//*[@id=\"shopify-section-1618886901395427e9\"]/div/div[2]/div/div[2]/div/a/div[2]/h3");
	By img3sec5 = By.xpath("//*[@id=\"shopify-section-1618886901395427e9\"]/div/div[2]/div/div[3]/div/a/div[2]/h3");
	By img4sec5 = By.xpath("//*[@id=\"shopify-section-1618886901395427e9\"]/div/div[2]/div/div[3]/div/a/div[2]/h3");

	// join aham family newsletter
	By contactemailField = By.name("contact[email]");
	By subscribeButton = By.xpath("//*[@id=\"Subscribe\"]/span");
	// About owner links(readmore)
	By readmoreLink = By.xpath("//*[@id=\"shopify-section-feature-row\"]/div/div/div[1]/a");
	// Aham retail store directions footer links
	By trivandrumDirectionLink = By
			.xpath("//*[@id=\"shopify-section-3bc71455-700a-48e5-840a-2e59359121fd\"]/div/div[2]/div[1]/a");
	By kottayamDirectionLink = By
			.xpath("//*[@id=\"shopify-section-3bc71455-700a-48e5-840a-2e59359121fd\"]/div/div[2]/div[2]/a");
	By koothatukulamDirectionLink = By
			.xpath("//*[@id=\"shopify-section-3bc71455-700a-48e5-840a-2e59359121fd\"]/div/div[2]/div[3]/a");
	// featured products add to cart
	By adcartfeaturedpLink = By.id("AddToCart-product-template");
	By checkoutLink = By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/footer/div/div[2]/input[2]");
	By continueShoppingLink = By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/footer/div/div[2]/a");
	By updatecartLink = By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/footer/div/div[2]/input[1]");
	//add address in account page
	By addaddressLink=By.xpath("//*[@id=\"MainContent\"]/div[1]/header/p[2]/button");
	By firstNAField=By.id("AddressFirstNameNew");
	By lastNAField=By.id("AddressLastNameNew");
	By companyAddresField=By.id("AddressCompanyNew");
	By address1Field=By.id("AddressAddress1New");
	By address2Field=By.id("AddressAddress2New");
	By cityAField=By.id("AddressCityNew");
	By provinceAF=By.id("AddressProvinceNew");
	By postalAField=By.id("AddressZipNew");
	By phoneAField=By.id("AddressPhoneNew");
	By addressAButton=By.xpath("//*[@id=\"address_form_new\"]/div[5]/input");
	/// view address in login page
	By viewAddressLink = By.xpath("//a[@class='btn btn--small']");
	public AhamHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void featuredprocartadd() {
		JavascriptExecutor scrollto=(JavascriptExecutor)driver;
		scrollto.executeScript("window.scrollBy(0,1200)");
		driver.findElement(img1Sub1).click();
		driver.findElement(adcartfeaturedpLink).click();
		driver.findElement(continueShoppingLink).click();
		driver.navigate().back();
		driver.findElement(updatecartLink).click();
		JavascriptExecutor scro=(JavascriptExecutor)driver;
		scro.executeScript("window.scrollBy(0,600)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(checkoutLink).click();
		driver.navigate().back();
	}
	public void scrollBy(int y)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(arguments[0], arguments[1]);", 0, y);
	}

	public void bodyLinks() {
		
		driver.findElement(img1Sec1Link).click();
		driver.navigate().back();

		driver.findElement(img2Sec1Link).click();
		driver.navigate().back();

	    driver.findElement(img3Sec1Link).click();
		driver.navigate().back();

		driver.findElement(img4Sec1Link).click();
		driver.navigate().back();

		driver.findElement(img1sec2Link).click();
		driver.navigate().back();

		driver.findElement(img2sec2Link).click();
		driver.navigate().back();

		driver.findElement(img3sec2Link).click();
		driver.navigate().back();

		driver.findElement(img4sec2Link).click();
		driver.navigate().back();

		scrollBy(800);
		driver.findElement(img1Sub1).click();
		driver.navigate().back();

		scrollBy(800);
		driver.findElement(img2Sub1).click();
		driver.navigate().back();
		
		scrollBy(800);
		driver.findElement(img3Sub1).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img4Sub1).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img1Sub2).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img2Sub2).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img3Sub2).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img4Sub2).click();
		driver.navigate().back();
        scrollBy(800);
		driver.findElement(img1Sub3).click();
		driver.navigate().back();
        scrollBy(800);
        driver.findElement(img2Sub3).click();
		driver.navigate().back();
        scrollBy(800);
        driver.findElement(img3Sub3).click();
		driver.navigate().back();
        scrollBy(800);
        driver.findElement(img4Sub3).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img1Sub4).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img2Sub4).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img3Sub4).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(img4Sub4).click();
		driver.navigate().back();
		scrollBy(800);
		driver.findElement(viewAllLink).click();
		driver.navigate().back();
		scrollBy(3200);
		driver.findElement(img1sec5).click();
		driver.navigate().back();
		scrollBy(2500);
		driver.findElement(img2sec5).click();
		driver.navigate().back();
        scrollBy(2500);
		driver.findElement(img3sec5).click();
		driver.navigate().back();
		scrollBy(2500);
		driver.findElement(img4sec5).click();
		driver.navigate().back();
		scrollBy(4000);
		 driver.findElement(readmoreLink).click();
		driver.navigate().back();

        scrollBy(4800);
		driver.findElement(trivandrumDirectionLink).click();
		driver.navigate().back();
		scrollBy(4800);
		driver.findElement(kottayamDirectionLink).click();
		driver.navigate().back();
		scrollBy(4800);
		driver.findElement(koothatukulamDirectionLink).click();
		driver.navigate().back();

	}

	public void newsletter(String contactEmail) {
		scrollBy(3600);
		driver.findElement(contactemailField).sendKeys(contactEmail);
		driver.findElement(subscribeButton).click();
	}

	public void viewAddress() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.elementToBeClickable(viewAddressLink));
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,200)");
		driver.findElement(viewAddressLink).click();
	}
	public void addAddress1(String firstnameaddress,String lastnameaddress,String companyAddress,String address1,String address2)
	{
		driver.findElement(addaddressLink).click();
		driver.findElement(firstNAField).sendKeys(firstnameaddress);
		driver.findElement(lastNAField).sendKeys(lastnameaddress);
		driver.findElement(companyAddresField).sendKeys(companyAddress);
		driver.findElement(address1Field).sendKeys(address1);
		driver.findElement(address2Field).sendKeys(address2);
		

	}
	public void provincedropdown(String country)
	{
		WebElement province=driver.findElement(provinceAF);
		Select dropdown=new Select(province);
		dropdown.selectByVisibleText(country);
	
	}
	public void addAddress2(String cityAddress,String postalAddress,String phonenoAddress)
	{
		driver.findElement(cityAField).sendKeys(cityAddress);
		driver.findElement(postalAField).sendKeys(postalAddress);
		driver.findElement(phoneAField).sendKeys(phonenoAddress);
	    driver.findElement(addressAButton).click();
	}


}
