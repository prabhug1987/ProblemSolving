package com.example.learning.recursion;

public class PrintNumbersUsingRecursion {
	public static void main(String[] args) {

		printNumbers(100);

	}

	private static void printNumbers(int i) {
		// TODO Auto-generated method stub
		if(i > 0) {
			printNumbers(i - 1);
			System.out.print(i +" ");
		}
		return; 
	}

}
