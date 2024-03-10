package com.spring.FactoryDesignPattern;


public class FactoryMainTest {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		ShapeFD shapeCircle = shapeFactory.getShape("CIRCLE");
		shapeCircle.draw();
		
		ShapeFD shapeRect = shapeFactory.getShape("RECTANGLE");
		shapeRect.draw();
	}

}
