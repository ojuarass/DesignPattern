package com.pattern.builder;

public class ChickenBurguer extends Burguer {

	@Override
	public String name() {
		return "Chicken Burguer";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
