package com.example.learning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MultiplesOf3 {

	public static void main(String[] args) {
		int[]  a = new int[] {-6,-91,1011,-100,84,-22,0,1,473};
		//Arrays.sort(a);
		System.out.println(solution(a));
	}

			public static int solution(int[] A) {
				//write your code in Java SE 8
		        int max = -10000;
		        //Arrays.sort(A);
		        /*int remainder = A[0] % 3;
		        if(remainder == 0 &&  max < A[0]) {
		        	max = A[0]; 
		        }*/
		        
		        System.out.println(max);
		        		
				for(int i=0; i < A.length; i++){
					
					//System.out.println(A[i]);
					//int sumOfDigit = sumOfDigit(A[i]);
					//System.out.println(sumOfDigit(A[i]));
					int remainder = A[i] % 3;
					//System.out.println("remainder ==" + remainder );
					if(remainder == 0 ){
						if(max < A[i]) {
							max = A[i]; 
						}
			        }
					
					//System.out.println("Max values is "+ max);
					//System.out.println("=========================");
			    }
				
				//Stream.of(A).filter(i -> (i % 3) == 0).sorted().max(Comparator.reverseOrder()).limit(1);
				
				
				
				return max;
				
				
		}
			
		public static int sumOfDigit(int n ) {
			int sum = 0;
			while(n!=0) {
				n = n / 10;
				int r = n % 10;
				sum = sum + r;
			}
			return sum;
		}

}
