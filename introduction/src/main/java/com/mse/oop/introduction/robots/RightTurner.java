package com.mse.oop.introduction.robots;

import com.mse.oop.introduction.principles.RightTurningRobot;

import kareltherobot.Robot;

public class RightTurner extends Robot implements RightTurningRobot {
	
	public RightTurner(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
