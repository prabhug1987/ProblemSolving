package com.example.learning;

import java.util.Arrays;

public class PythogoreanTriplets {

	static boolean isTriplet(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					// calculate square of array elements
					int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];

					if (x == y + z || y == x + y || z == x + y) {
						System.out.printf("pythogorean triplets are : arr[%d] = %d, arr[%d] = %d, arr[%d] = %d", i,
								arr[i], j, arr[j], k, arr[k]);
						System.out.println();
						System.out.printf("pythogorean triplets are : x = %d, y = %d, z = %d", x, y, z);
						System.out.println();
						return true;
					}
				}
			}
		}

		// we reached here, no triplet found
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 2, 6 };
		if (isTriplet(arr, arr.length) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isTriplet1(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);

		int l = 0;
		int r = n - 1;

		for (int i = 0; i < arr.length; i++) {

			while (l < r) {
				if (arr[l] + arr[r] == arr[i])
					return true;

				if (arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}

		}

		return false;
	}

}
