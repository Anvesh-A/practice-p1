package com.proj;

public class methodExecution {

	public int add(int a, int b) {
		int z = a + b;
		return z;
	}

	public static void main1(String[] args) {

		methodExecution m = new methodExecution();
		int result = m.add(20, 15);
		System.out.println("addition is :" + result);
	}

	// call by value
	public static class callMethod {

		int val = 100;

		int operation(int val) {
			val = val * 10 / 100;
			return (val);
		}

		public static void main(String args[]) {
			callMethod d = new callMethod();
			System.out.println("Before operation value of data is " + d.val);
			d.operation(100);
			System.out.println("After operation value of data is " + d.val);
		}
	}

	// method overloading
	public static class overloadMethod {

		public void area(int l, int w) {
			System.out.println("Area of rectangle : " + ( l * w));
		}

		public void area(int r) {
			System.out.println("Area of Circle : " + (3.14 * r * r));
		}

		public static void main(String args[]) {

			overloadMethod ob = new overloadMethod();
			ob.area(11, 7);
			ob.area(8);
		}
	}

}
