package com.logical.code.designpatterns.structural.decorator.second;

public class ShapeDecorator implements Shape {

	public Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
