package com.spring.DecoratorDesignPattern;

import com.spring.DecoratorDesignPattern.Decorator.RedShapeDecorator;

public class DecoratorMainTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle only");
		circle.draw();
		
		System.out.println("\nCircle with Red border");
		redCircle.draw();
		
		System.out.println("\nRectangle with Red border");
		redRectangle.draw();

	}

}
