package com.github.singleton.run;

import java.io.IOException;

import com.github.singleton.NotSingleton;
import com.github.singleton.Singleton;

//import com.github.singleton.Singleton;

public class Run {
	public static void main(String[] args) throws IOException {

		// Singleton example
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());

		if (x == y && y == z) {

			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {

			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}

		// Not a Singleton example
		NotSingleton a = new NotSingleton();
		NotSingleton b = new NotSingleton();
		NotSingleton c = new NotSingleton();

		System.out.println("Hashcode of a is " + a.hashCode());
		System.out.println("Hashcode of b is " + b.hashCode());
		System.out.println("Hashcode of c is " + c.hashCode());

		if (a == b && b == c) {

			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}
	}
}
