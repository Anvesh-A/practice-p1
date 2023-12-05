package com.proj;

interface First {
	default void show() {
		System.out.println("Default First");
	}
}

interface Second {
	default void show() {
		System.out.println("Default Second");
	}
}

public class diamondTest implements First, Second {
	public void show() {
		First.super.show();
		Second.super.show();
	}

	public static void main(String args[]) {
		diamondTest ob = new diamondTest();
		ob.show();
	}
}
