package com.ebay.mx.capacitacion.purchase.tasks;

import com.ebay.mx.capacitacion.purchase.userinterfaces.EbaySearchResultPage;
import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayToolsBar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchForAnItem implements Task {

	String type;
	String productId;

	public SearchForAnItem(String type, String productId) {

		this.type = type;
		this.productId = productId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(type).into(EbayToolsBar.SEARCH_BOX));
		actor.attemptsTo(Click.on(EbayToolsBar.SEARCH_BUTTON));
		// actor.attemptsTo(Click.on(EbayToolsBar.SEARCH_BUTTON));
		// actor.attemptsTo(Click.on(EbaySearchResultPage.NEXT_PAGE_BUTTON));
		// actor.attemptsTo(Click.on(EbaySearchResultPage.NEXT_PAGE_BUTTON));

		actor.attemptsTo(Click.on(EbaySearchResultPage.getRESULT_ITEM(productId)));

	}

	public static SearchForAnItem ofType(String type, String id) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SearchForAnItem.class, type, id);
	}
}
