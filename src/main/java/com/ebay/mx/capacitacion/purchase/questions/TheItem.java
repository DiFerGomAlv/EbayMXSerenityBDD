package com.ebay.mx.capacitacion.purchase.questions;

import javax.swing.JOptionPane;

import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayShoppingCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

public class TheItem implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Attribute.of(EbayShoppingCart.ADDED_ITEM).named("data-test-info").viewedBy(actor).value()
				.toString();
	}

	public static TheItem AddedToTheCart() {
		return new TheItem();
	}

}
