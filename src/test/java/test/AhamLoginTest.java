package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AhamCheckoutPage;
import page.AhamHomePage;
import page.AhamLoginPage;
import page.AhamRegisterPage;
import page.HeaderFooterPage;

public class AhamLoginTest {
	WebDriver driver;
	

	@BeforeTest
	public void chromeSet() {
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void setUp() {
		driver.get("https://aham.store/");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void headerFooterLinks() throws InterruptedException {
		HeaderFooterPage headerFooter = new HeaderFooterPage(driver);
		AhamHomePage cartaddfeaturedpros = new AhamHomePage(driver);
		headerFooter.header1Links();// check all links in header
	    headerFooter.searchField("tissue");// search "tissue" on search field of homepage header
		headerFooter.header2Links();// check all links in header
		headerFooter.logo();//logo check
		cartaddfeaturedpros.bodyLinks();// check all links in bodylinks
		cartaddfeaturedpros.newsletter("swathi.m_95@yahoo.com");// newsletter email and subscribe
		headerFooter.footerLinks();// check all footer links
	}
@Test(priority=2)

	public void registerPage() {
		AhamLoginPage createAcLink = new AhamLoginPage(driver);
		HeaderFooterPage loginLink = new HeaderFooterPage(driver);
		AhamRegisterPage registerPage = new AhamRegisterPage(driver);
		loginLink.loginLink();// click on login link
		createAcLink.createAccount();// click create account
		registerPage.setRegisterValues("Swathy", "K", "95mswathi@gmail.com", "Automation_pro24");// add values to
		registerPage.createSubmitbutton();// click submit

	}

	@Test(priority=3)
	public void testLogin() {
		HeaderFooterPage headerF = new HeaderFooterPage(driver);
		AhamLoginPage login = new AhamLoginPage(driver);
		headerF.loginLink();// go to login page
		login.setValues("95mswathi@gmail.com", "Automation_pro24");// add values to login page
	    login.clickSignin();// click sign in

	}

	@Test(priority=4)
	public void accountManage() {
		AhamHomePage address = new AhamHomePage(driver);
	   HeaderFooterPage header= new HeaderFooterPage(driver);
		
	   address.viewAddress();// click view address
		address.addAddress1("Rakesh", "Pillai", "Luminar", "Vilasam", "Pathanmathitta");// add address fields 1
		address.provincedropdown("Kerala");// select dropdown province
		address.addAddress2("Kochi", "909078", "83847238478");// add address fields 2
		header.loginlogo();// click logo to add products from featured products
	}

	@Test(priority=5)
	public void cartFeaturedproAdd() {
		AhamHomePage cartaddfeaturedpro = new AhamHomePage(driver);
		cartaddfeaturedpro.featuredprocartadd();// select 1 st picture,click add to cart,click continue shopping,click
												// update,click checkout
	}

	@Test(priority=6)
	public void checkoutPage() {
		AhamCheckoutPage checkout = new AhamCheckoutPage(driver);
		HeaderFooterPage headerFr = new HeaderFooterPage(driver);
		//checkout.carticonCheckout();// cart icon in checkout page and back//*checkout.checkout("Swathy", "Krishna", "Vilasam,Manakad", "90-kp", "Pathanamthitta", "689533", "782378732739");// address
		headerFr.loginLink();// click on login on header
		checkout.checkoutlogout();// click logout
	}

	@AfterTest
	public void tearDown() {

		if (driver != null) {
			driver.close();
		}
	}
}
