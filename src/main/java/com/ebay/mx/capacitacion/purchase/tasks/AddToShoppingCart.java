package com.ebay.mx.capacitacion.purchase.tasks;

import javax.swing.JOptionPane;

import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayShoppingCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Attribute;

public class AddToShoppingCart implements Task {

	public String itemId = "";

	@Override
	public <T extends Actor> void performAs(T actor) {
		String href = Attribute.of(EbayShoppingCart.ADD_TO_SHOPPING_CART_BUTTON).named("href").viewedBy(actor).value()
				.toString();
		int inicio = href.indexOf("item") + 9;
		int fin = href.indexOf(",");
		itemId = href.substring(inicio, fin);

		actor.attemptsTo(Click.on(EbayShoppingCart.ADD_TO_SHOPPING_CART_BUTTON));
	}

	public static AddToShoppingCart the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(AddToShoppingCart.class);
	}
}
