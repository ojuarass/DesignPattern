package com.pattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQuare");
		shape3.draw();
		
		Shape shape4 = shapeFactory.getShape("other");
		System.out.println(shape4 == null);
	}

}
