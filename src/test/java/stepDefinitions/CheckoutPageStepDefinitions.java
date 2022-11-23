package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {
	public WebDriver driver;
	// public String landingPageProductName;
	// public String offerPageProduct;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;

	public CheckoutPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getcheckoutPage();
		
		System.out.println("Please pull the code from the Github");
		System.out.println("Please pull the code from the Github")
		System.out.println("Please pull the code from the Github")
	}

	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
     checkoutPage.Checkouttems();
    // Thread.sleep(2000);
	}

	@And("^verify user has ability to enter promo code and place the order$")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}

}
