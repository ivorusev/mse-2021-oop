package com.mse.oop.introduction.figures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mse.oop.introduction.figures.robots.Drawer;
import com.mse.oop.introduction.figures.robots.SquareDrawerRobot;
import com.mse.oop.introduction.robots.AdvancedRobot;

import kareltherobot.Directions;
import kareltherobot.World;

class FigureDrawerTest {

	@Test
	void testDrawSquare() throws InterruptedException {
		World.setSize(10, 10);
		World.setDelay(0);
		Figure square = new Square(1, 4, 3);
		Drawer robot = new SquareDrawerRobot(1, 1, Directions.North, 12);
		robot.draw(square);
		
		// Verification steps
		AdvancedRobot advanced = (AdvancedRobot) robot;
		assertFalse(advanced.anyBeepersInBeeperBag());
		assertEquals(1, advanced.getAvenue());
		assertEquals(4, advanced.getStreet());
	}

	@Test
	void testDrawRectangle() {
		fail("Not yet implemented");
	}

}
