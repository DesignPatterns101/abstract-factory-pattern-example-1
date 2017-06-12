package com.java.design.pattern.abstractfactory;

import com.java.design.pattern.model.Color;
import com.java.design.pattern.model.Shape;

public class AbstractFactoryMain {
	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.drawShape();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		shape2.drawShape();

		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape3.drawShape();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color color1 = colorFactory.getColor("RED");

		color1.fillColor();

		Color color2 = colorFactory.getColor("Green");

		color2.fillColor();

		Color color3 = colorFactory.getColor("BLUE");

		color3.fillColor();
	}

}
