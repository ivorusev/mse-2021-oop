package com.mse.oop.introduction.figures;

public class Rectangle extends Square {

	private int height;

	public Rectangle(int x, int y, int size, int height) {
		super(x, y, size);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Square [x=" + getX() + ", y=" + getY() + ", width=" + getSize() + ", height=" + height + "]";
	}

}
