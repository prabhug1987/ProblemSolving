package com.example.learning.sum;

import java.util.HashSet;
import java.util.Set;

public class SumExample {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,10,11};
		findPairs(a, 12);
	}

	public static void findPairs(int arr[], int sum) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int diff = sum  - arr[i];
			if(set.contains(diff)) {
				System.out.println("Pair with given sum "+ sum + "is ("+arr[i]+", "+ diff+")");
			}
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}
}
