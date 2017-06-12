package com.java.design.pattern.abstractfactory;

import com.java.design.pattern.model.Color;
import com.java.design.pattern.model.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);

}
