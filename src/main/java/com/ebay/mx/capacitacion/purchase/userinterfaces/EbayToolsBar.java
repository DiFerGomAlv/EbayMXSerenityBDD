package com.ebay.mx.capacitacion.purchase.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EbayToolsBar {
	public static final Target SEARCH_BOX = Target.the("Ebay search box").located(By.id("gh-ac"));
	public static final Target SEARCH_BUTTON = Target.the("Ebay search button").located(By.id("gh-btn"));
	public static final Target SHOPPING_CART_BUTTON = Target.the("Ebay shopping cart")
			.locatedBy("//li[@id='gh-cart']/a");

}
