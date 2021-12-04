package com.mse.oop.demo;

import com.mse.oop.introduction.figures.Figure;
import com.mse.oop.introduction.figures.Square;

public class Launcher {

	public static void main(String[] args) {
//		Person ivan = new Person("ivan", 20);
//		ivan.printPersonInfo();
//		
//		Person petko = new Person("petko", 20);
//		petko.printPersonInfo();
		
		Figure square = new Square(2, 2, 3);
		System.out.println(square.toString());
	}

}
