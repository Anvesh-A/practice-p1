package com.proj;

import java.util.Scanner;

public class Calculator {

	public int add(int x, int y) {
		return x + y;

	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		Calculator C = new Calculator();

		int a = C.add(10, 8);
		int b = C.sub(10, 5);
		int c = C.mul(10, 5);
		int d = C.div(20, 5);

		System.out.println("the sum of two numbers is: " + a);
		System.out.println("the subtraction of two numbers is: " + b);
		System.out.println("the mul of two numbers is: " + c);
		System.out.println("the div of two numbers is: " + d);
	}
}