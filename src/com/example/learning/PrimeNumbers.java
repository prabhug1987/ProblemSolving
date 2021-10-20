package com.example.learning;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		int n = 5;
		//int n1 = 2;
		
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}

			if (count == 2) {
				System.out.printf("%d is prime number ", i);
				System.out.println();
			}
		}

	}
}
