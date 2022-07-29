package com.github.singleton;

public class Singleton {

	private static Singleton single_instance = null;

	public String name;

	private Singleton() {

		name = "Test Person";
	}

	public static Singleton getInstance() {

		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}
