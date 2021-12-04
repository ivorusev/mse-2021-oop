package com.mse.oop.introduction.figures;

public class Square extends Figure {

	private int size;

	public Square(int x, int y, int size) {
		super(x, y);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Square [x=" + getX() + ", y=" + getY() + ", size=" + size + "]";
	}

}
