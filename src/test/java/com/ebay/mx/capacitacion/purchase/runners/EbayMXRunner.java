package com.ebay.mx.capacitacion.purchase.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/ebay/mx/capacitacion/purchase/features/ebay_mx.feature",
				glue = "com.ebay.mx.capacitacion.purchase.stepdefinitions",
				snippets = SnippetType.CAMELCASE)
public class EbayMXRunner {

}
