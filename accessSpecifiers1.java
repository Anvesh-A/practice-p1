package com.proj;

//Access modifiers
class defAccessModifiers {

	void m1() {
		System.out.println("You are using defalut access specifier");
	}
}

public class accessSpecifiers1 {

	public static void main(String[] args) {
		// default
		System.out.println("Dafault Access Specifier");
		defAccessModifiers d = new defAccessModifiers();
		d.m1();

	}
}

class priaccessModifier {
	private void m2() {
		System.out.println("You are using private access specifier");
	}
}

class accessSpecifiers2 {

	public static void main(String[] args) {
		// private
		System.out.println("Private Access Specifier");
		priaccessModifier p1 = new priaccessModifier();
		// trying to access private method of another class
		// p1.m2();

	}
}
