package com.mse.oop.introduction.figures.robots;

import com.mse.oop.introduction.figures.Figure;
import com.mse.oop.introduction.robots.AdvancedRobot;

public class RectangleDrawerRobot extends AdvancedRobot implements Drawer {

	public RectangleDrawerRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	@Override
	public void draw(Figure figure) {
		// ToDo
	}

}
