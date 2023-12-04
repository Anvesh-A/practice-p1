package com.proj;

public class arraysdemo {

	public static void main(String[] args) {
		// single dimension array
		String[] str = new String[4];

		str[0] = "hello";
		str[1] = "he";
		str[2] = "hie";
		str[3] = "hey";

		for (String i : str) {
			System.out.println(i);
		}

		// multi dimension array

		String[][] names = new String[3][2];
		names[0][0] = "sai";
		names[0][1] = "sujith";
		names[1][0] = "sree";
		names[1][1] = "kiran";
		names[2][0] = "charan";
		names[2][1] = "satta";

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[0].length; j++) {
				System.out.println("names at i=" + i + ", j=" + j + " is " + names [i][j]);
				
		
			}

		}

	
	}
}
	
	


