package com.ebay.mx.capacitacion.purchase.tasks;

import com.ebay.mx.capacitacion.purchase.userinterfaces.EbaySearchResultPage;
import com.ebay.mx.capacitacion.purchase.userinterfaces.EbayToolsBar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class SearchForAnItem implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("dualshock 4").into(EbayToolsBar.SEARCH_BOX));
		actor.attemptsTo(Click.on(EbayToolsBar.SEARCH_BUTTON));
		actor.attemptsTo(Click.on(EbayToolsBar.SEARCH_BUTTON));
		actor.attemptsTo(Click.on(EbaySearchResultPage.NEXT_PAGE_BUTTON));
		actor.attemptsTo(Click.on(EbaySearchResultPage.NEXT_PAGE_BUTTON));
		
		actor.attemptsTo(Click.on(EbaySearchResultPage.RESULT_ITEM));
		
	}

	public static SearchForAnItem the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SearchForAnItem.class);
	}
}
