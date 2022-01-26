package com.logical.code.designpatterns.structural.decorator.second;

public class DecoratorDesignPatternDemo {
	
	public static void main(String[] args) {
		
		Shape circle = new Circle();	
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());	
		redCircle.draw();
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());	
		redRectangle.draw();
	}
}
