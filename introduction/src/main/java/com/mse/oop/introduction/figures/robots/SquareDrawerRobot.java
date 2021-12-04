package com.mse.oop.introduction.figures.robots;

import com.mse.oop.introduction.figures.Figure;
import com.mse.oop.introduction.figures.Square;
import com.mse.oop.introduction.robots.AdvancedRobot;

import kareltherobot.Directions;

public class SquareDrawerRobot extends AdvancedRobot implements Drawer {

	public SquareDrawerRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	@Override
	public void draw(Figure figure) {
		if (!(figure instanceof Square)) {
			throw new IllegalArgumentException("Unknown figure type!");
		}
		Square square = (Square) figure;
		moveTo(figure.getX(), figure.getY());
		turnTo(Directions.East);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < square.getSize(); j++) {
				putBeeper();
				move();
			}
			turnLeft();
		}
		turnRight();
	}

}
