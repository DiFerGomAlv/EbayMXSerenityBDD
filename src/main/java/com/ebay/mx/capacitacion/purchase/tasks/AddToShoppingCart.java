package com.ebay.mx.capacitacion.purchase.tasks;

import javax.swing.JOptionPane;

import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayShoppingCart;
import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayToolsBar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Attribute;

public class AddToShoppingCart implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(EbayShoppingCart.ADD_TO_SHOPPING_CART_BUTTON),
				Click.on(EbayToolsBar.SHOPPING_CART_BUTTON));
	}

	public static AddToShoppingCart theProduct() {
		return Tasks.instrumented(AddToShoppingCart.class);
	}
}
