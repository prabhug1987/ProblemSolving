package com.example.learning;

import java.awt.image.AbstractMultiResolutionImage;

public class checkIndexesAreEqual {

	public static void main(String[] args) {
		int[] A = new int[] {0,4,-1,0,3};
		int[] B = new int[] {0,-2,5,0,3};
		
		System.out.println(solution(A,B));
	}

	public static int solution(int[] A, int[] B) {
		// write your code in Java SE 8
		int result[] = new int[A.length];
		
		
		for (int i = 0; i < A.length; i++) {
			
			//check the sub array sums are equal then return
			int subArr[] = System.arraycopy(B, 0, result, 0, 0);
			
		}
		
		
		
	}

}
