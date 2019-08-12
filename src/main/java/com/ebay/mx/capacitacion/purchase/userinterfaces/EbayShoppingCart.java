package com.ebay.mx.capacitacion.purchase.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EbayShoppingCart {
	public static final Target ADDED_ITEM = Target.the("The added item").locatedBy("//*[@class='listsummary']");
	public static final Target ADD_TO_SHOPPING_CART_BUTTON = Target.the("Button to add the item to the shopping cart")
			.located(By.id("isCartBtn_btn"));
}
