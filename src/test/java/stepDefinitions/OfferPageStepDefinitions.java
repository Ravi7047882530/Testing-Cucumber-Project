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
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinitions {

	public String offerPageProduct;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

//single responsbility Principle
	// Loosly coupled
	// Factory Design pattern
	public OfferPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		System.out.println("Please pull the code from the Github");
		System.out.println("Please pull the code from the Github1");
		System.out.println("Please pull the code from the Github2");
		System.out.println("Please pull the code from the Github3");
		System.out.println("Please pull the code from the Github4");
		System.out.println("Please pull the code from the Github5");
		System.out.println("Please pull the code from the Github6");
		System.out.println("Azure Devops develop");
		System.out.println("Azure Devops develop1");
		System.out.println("Azure Devops develop2");
		System.out.println("Azure Devops develop for Hooks");
		System.out.println("Azure Devops develop for Hooks1");
		System.out.println("Azure Devops develop for Hooks2");


	}

	@Then("^user searched for (.+) shortName in offers page to check if product exist with same name$")
	public void user_searched_for_short_name_in_offers_page_to_check_if_product_exist_with_same_name(String shortName) 
			throws InterruptedException {
			
		switchToOfferPage();
		OfferPage offerPage = testContextSetup.pageObjectManager.OfferPage();
		offerPage.searchItem(shortName);
	   Thread.sleep(2000);
		offerPageProduct = offerPage.getProductName();
		// OfferPageProduct = testcontextsetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}

	public void switchToOfferPage() {
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtlis.SwitchWindowToChild();
		
	}

	
	
	
	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProduct ,testContextSetup.landingPageproductName);

	}
}
