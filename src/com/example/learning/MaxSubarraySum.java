package com.example.learning;

public class MaxSubarraySum {
	
	public static void main(String[] args) {
		int[] a = {-2,-3,4,-1,-2,1,5, -3};
		
		System.out.println("Maximum subarray sum is "+ MaxSubarraySum(a));
	}

	private static int MaxSubarraySum(int[] a) {
		// TODO Auto-generated method stub
		
		int max_so_for =Integer.MIN_VALUE;
		int max_ending_here = 0;;
		
		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			
			if(max_so_for < max_ending_here )
				max_so_for = max_ending_here;
			if(max_ending_here < 0)
				max_ending_here = 0;
		}
		
		return max_so_for;
	}

}
