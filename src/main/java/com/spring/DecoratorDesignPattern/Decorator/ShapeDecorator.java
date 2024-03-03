package com.spring.DecoratorDesignPattern.Decorator;

import com.spring.DecoratorDesignPattern.Shape;

public abstract class ShapeDecorator implements Shape {

	//protected variable
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decorateShape) {
		this.decoratedShape = decorateShape;
	}
	
	public void draw() {
		decoratedShape.draw();

	}

}
