package com.mse.oop.demo;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
	}
	
	public void printPersonInfo() {
		System.out.println(name + " " + age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
