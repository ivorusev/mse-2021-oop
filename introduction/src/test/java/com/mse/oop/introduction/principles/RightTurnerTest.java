package com.mse.oop.introduction.principles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mse.oop.introduction.robots.RightTurner;

import kareltherobot.Directions;
import kareltherobot.World;

class RightTurnerTest {

	@Test
	public void testRightTurner() {
		World.setSize(3, 3);
		World.setDelay(0);
		RightTurner robot = new RightTurner(1, 1, Directions.North, 0);
		robot.turnRight();
		assertTrue(robot.facingEast());
	}

}
