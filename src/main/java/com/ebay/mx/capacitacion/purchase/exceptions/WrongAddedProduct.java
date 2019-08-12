package com.ebay.mx.capacitacion.purchase.exceptions;

public class WrongAddedProduct extends AssertionError {

	public WrongAddedProduct(String mensage, Throwable causa) {
		super(mensage, causa);
	}

}
