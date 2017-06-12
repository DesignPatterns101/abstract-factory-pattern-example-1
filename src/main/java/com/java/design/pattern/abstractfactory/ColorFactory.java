package com.java.design.pattern.abstractfactory;

import com.java.design.pattern.model.Blue;
import com.java.design.pattern.model.Color;
import com.java.design.pattern.model.Green;
import com.java.design.pattern.model.Red;
import com.java.design.pattern.model.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
