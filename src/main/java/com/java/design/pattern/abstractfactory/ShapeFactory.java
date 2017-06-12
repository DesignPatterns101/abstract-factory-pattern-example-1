package com.java.design.pattern.abstractfactory;

import com.java.design.pattern.model.Circle;
import com.java.design.pattern.model.Color;
import com.java.design.pattern.model.Rectangle;
import com.java.design.pattern.model.Shape;
import com.java.design.pattern.model.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if (shape == null) {
			return null;
		}

		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

}
