package com.interview.problem;

public class Recman {

	public static void main(String[] args) {
       int n = 17;
       recman(n);
	}

	// prints first n terms
	static void recman(int n) {
		// create an array to store terms
		int arr[] = new int[n];

		// first term of sequence is always 0
		arr[0] = 0;
		System.out.print(arr[0] + " ,");

		// Fill remaining term using recursive
		// formula

		for (int i = 1; i < n; i++) {

			int curr = arr[i - 1] - i;
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == curr || curr < 0) {
					curr = arr[i - 1] + i;
				}
			}
			arr[i] = curr;
			System.out.print(arr[i] + ",");
		}
	}

}
