package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	public WebDriver driver;
	public String landingPageproductName;
	public String OfferPageProduct;
	TestContextSetup testContextSetup;
	LandingPage landingPage;


		public LandingPageStepDefinitions(TestContextSetup testContextSetup) {
			this.testContextSetup = testContextSetup;
			this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		}

		@Given("User is on GreenCard Landing page")
		public void user_is_on_green_card_landing_page() {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));

	}

	
	@When("^user searched with shortName (.+)and extracted with actual name of the product$")
	public void user_searched_with_short_name_and_extracted_with_actual_name_of_the_product(String shortName)
			throws InterruptedException {
       landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageproductName + " is extracted from the home page ");
	}
	
	 @And("^Added \"([^\"]*)\" items of the selected product to cart$")
	    public void added_something_items_of_the_selected_product_to_cart(String quantity) throws Throwable {
	     
		 landingPage.incrementQuantity(Integer.parseInt(quantity));
		 landingPage.addToCart();
	    }

}
