package page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HeaderFooterPage {
	WebDriver driver;
	// header links //*[@id="shopify-section-header"]/div/header/div/div[2]/div/a[1]
	By homeLink = By.xpath("//*[@id=\"SiteNav\"]/li[1]/a");
	By newArrivalsLink = By.xpath("//*[@id=\"SiteNav\"]/li[2]/a");
	By onamCollectionsLink = By.xpath("//*[@id=\"SiteNav\"]/li[3]/a");
	By preOrdersLink = By.xpath("//*[@id=\"SiteNav\"]/li[4]/a");
	By saleLink = By.xpath("//*[@id=\"SiteNav\"]/li[5]/a");
	By bestSellersLink = By.xpath("//*[@id=\"SiteNav\"]/li[6]/a");
	By premiumColleLink = By.xpath("//*[@id=\"SiteNav\"]/li[7]/a");
	By sareesLink = By.xpath("//*[@id=\"SiteNav\"]/li[8]/a");
	By salwarSetsLink = By.xpath("//*[@id=\"SiteNav\"]/li[9]/a");
	By kurtasLink = By.xpath("//*[@id=\"SiteNav\"]/li[10]/a");
	By dinusCollecLink = By.xpath("//*[@id=\"SiteNav\"]/li[11]/a");
	By twineCutWorkLink = By.xpath("//*[@id=\"SiteNav\"]/li[12]/a");
	By kidsCollecLink = By.xpath("//*[@id=\"SiteNav\"]/li[13]/a");
	By dupattasLink = By.xpath("//*[@id=\"SiteNav\"]/li[14]/a");
	By blousesLink = By.xpath("//*[@id=\"SiteNav\"]/li[15]/a");
	By bottomwear = By.xpath("//*[@id=\"SiteNav\"]/li[16]/a");
	// header anouncement link
	By announcementLink = By.xpath("//*[@id=\"shopify-section-header\"]/div/a/p");
	// header search,login,cart links
	By searchLink = By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/div/form/input");
	By loginLink = By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]");
	By cartLink = By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[2]");
	// headerlogo
	By logoLink = By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[1]/h1/a/img");

	// aham copyright links
	By copyrightAhamLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[2]/div[2]/div/small/a");
	// footer links
	By aboutUsLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[1]/a");
	By refundExchangeLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[2]/a");
	By shippingLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[3]/a");
	By privacyLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[4]/a");
	By termsLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[5]/a");
	By contactLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[6]/a");
	By searchfooterLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/ul/li[7]/a");
	// socialmedia footer icons link
	By facebookLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[2]/div[1]/ul/li[1]/a");
	By instagramLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[2]/div[1]/ul/li[2]/a");
	By youtubeLink = By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div/div[2]/div[1]/ul/li[3]/a");

	By loginlogo=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[1]/div/a");
	public HeaderFooterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginLink() {
		driver.findElement(loginLink).click();
	}

	public void logo() {
		driver.findElement(logoLink).click();
	}
	public void loginlogo()
	{
		driver.findElement(loginlogo).click();
		
	}
	public void scrollToo()
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public void header1Links() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(homeLink).click();
		
		driver.findElement(newArrivalsLink).click();
		driver.navigate().back();
		
		driver.findElement(onamCollectionsLink).click();
		driver.navigate().back();
		
		driver.findElement(preOrdersLink).click();
		driver.navigate().back();
		
		driver.findElement(saleLink).click();
		Thread.sleep(1000);
		
		driver.findElement(bestSellersLink).click();
		driver.navigate().back();
		
		driver.findElement(premiumColleLink).click();
		driver.navigate().back();
		
		driver.findElement(sareesLink).click();
		Thread.sleep(1000);
		driver.findElement(salwarSetsLink).click();
		Thread.sleep(1000);
		driver.findElement(kurtasLink).click();
		Thread.sleep(1000);
		driver.findElement(dinusCollecLink).click();
		driver.navigate().back();
		
		driver.findElement(twineCutWorkLink).click();
		driver.navigate().back();
		
		driver.findElement(kidsCollecLink).click();
		driver.navigate().back();
		
		driver.findElement(dupattasLink).click();
		driver.navigate().back();
		
		driver.findElement(blousesLink).click();
		driver.navigate().back();
		
		driver.findElement(bottomwear).click();
		driver.navigate().back();

		driver.findElement(announcementLink).click();
		driver.navigate().back();

	

		/// scrolldown statement remaining
	}

	public void searchField(String searchField) {
		driver.findElement(searchLink).sendKeys(searchField,Keys.ENTER);
		driver.navigate().back();
	}
public void header2Links()
{
	
	driver.findElement(loginLink).click();
    driver.navigate().back();
	driver.findElement(cartLink).click();
	driver.navigate().back();

	driver.findElement(logoLink).click();
}
	public void footerLinks() {
        scrollToo();
		driver.findElement(copyrightAhamLink).click();
		scrollToo();
		driver.findElement(aboutUsLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(refundExchangeLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(shippingLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(privacyLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(termsLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(contactLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(searchfooterLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(facebookLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(instagramLink).click();
		driver.navigate().back();
		scrollToo();
		driver.findElement(youtubeLink).click();
		driver.navigate().back();

	}
}
