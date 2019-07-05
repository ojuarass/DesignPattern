package com.pattern.builder;

public class VegBurguer extends Burguer {

	@Override
	public String name() {
		return "Veg Burguer";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
