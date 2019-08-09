package com.ebay.mx.capacitacion.purchase.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;

import com.ebay.mx.capacitacion.purchase.questions.TheItem;
import com.ebay.mx.capacitacion.purchase.tasks.AddToShoppingCart;
import com.ebay.mx.capacitacion.purchase.tasks.OpenTheBrowser;
import com.ebay.mx.capacitacion.purchase.tasks.SearchForAnItem;
import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayMXHomePage;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class EbayMXStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;

	private Actor diego = Actor.named("Diego");

	private EbayMXHomePage ebayMxHomePage;
	
	private String selectedItemId="";

	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^That Diego enters ebay mexico site$")
	public void thatDiegoEntersEbayMexicoSite() throws Exception {
		diego.wasAbleTo(OpenTheBrowser.on(ebayMxHomePage));

	}

	@When("^Diego chooses the product to be bought$")
	public void diegoChoosesTheProductToBeBought() throws Exception {
		diego.wasAbleTo(SearchForAnItem.the());
		
		
		AddToShoppingCart addToShoppingCart = AddToShoppingCart.the();
		diego.wasAbleTo(addToShoppingCart);
		
		selectedItemId=addToShoppingCart.itemId;
	}

	@Then("^Diego can see the item in the shopping cart$")
	public void diegoCanSeeTheItemInTheShoppingCart() throws Exception {
		diego.should(seeThat(TheItem.AddedToTheCart(), containsString(selectedItemId)));
	}

}
