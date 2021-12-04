package com.mse.oop.introduction.principles;

import com.mse.oop.introduction.robots.AdvancedRobot;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class Demo {

	public static void main(String[] args) {
		World.setSize(10, 10);
		World.setVisible();
		World.setDelay(10);
		AdvancedRobot robot = new AdvancedRobot(1, 1, Directions.North, 100);
		robot.moveTo(6, 5);
	}

}
