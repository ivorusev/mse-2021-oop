package com.mse.oop.introduction.robots;

import kareltherobot.Directions;

public class AdvancedRobot extends RightTurner {

	private int street;
	private int avenue;

	public AdvancedRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		this.street = street;
		this.avenue = avenue;
	}

	@Override
	public void move() {
		super.move();
		if (facingEast()) {
			avenue++;
		} else if (facingWest()) {
			avenue--;
		} else if (facingNorth()) {
			street++;
		} else if (facingSouth()) {
			street--;
		}
	}

	public void moveTo(int x, int y) {
		if (x < getAvenue()) {
			while (!facingWest()) {
				turnLeft();
			}
			while (getAvenue() != x) {
				move();
			}
		} else if (x > getAvenue()) {
			while (!facingEast()) {
				turnLeft();
			}
			while (getAvenue() != x) {
				move();
			}
		}

		if (y > getStreet()) {
			while (!facingNorth()) {
				turnLeft();
			}
			while (getStreet() != y) {
				move();
			}
		} else if (y < getStreet()) {
			while (!facingSouth()) {
				turnLeft();
			}
			while (getStreet() != y) {
				move();
			}
		}
	}

	public void turnTo(Direction direction) {
		while (direction != getDirection()) {
			turnLeft();
		}

	}

	public Direction getDirection() {
		if (facingEast()) {
			return Directions.East;
		} else if (facingWest()) {
			return Directions.West;
		} else if (facingNorth()) {
			return Directions.North;
		} else if (facingSouth()) {
			return Directions.South;
		}
		return null;
	}

	public int getStreet() {
		return street;
	}

	public int getAvenue() {
		return avenue;
	}

}
