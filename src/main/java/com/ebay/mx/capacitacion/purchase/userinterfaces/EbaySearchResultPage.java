package com.ebay.mx.capacitacion.purchase.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EbaySearchResultPage {
	public static final Target NEXT_PAGE_BUTTON = Target.the("Next page button")
			.locatedBy("//*[@class='x-pagination__control' and @rel='next']");
	public static final Target RESULT_ITEM = Target.the("Item from search result")
			.locatedBy("(//*[@class='s-item__link'])[7]");
}