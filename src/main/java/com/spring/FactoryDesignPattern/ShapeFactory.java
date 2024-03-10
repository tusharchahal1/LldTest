package com.spring.FactoryDesignPattern;

public class ShapeFactory {
	
	ShapeFD getShape(String shapeType) {
		
		switch(shapeType) {
		
		case "CIRCLE":
			return new CircleFD();
		case "RECTANGLE":
			return new RectangleFD();
		default:
			return null;
		}
		
	}

}
