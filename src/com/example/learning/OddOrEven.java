package com.example.learning;

public class OddOrEven {

	public static void main(String[] args) {
		String str = "011100";
		System.out.println(calculateBinaryToDecimal(str));
	}

	public static int calculateBinaryToDecimal(String n) {
		int sum = 0;
		
		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.println(n.charAt(i) + " index is " + i);
			System.out.println(Math.pow(Integer.valueOf(n.charAt(i)), i));
			sum = (int) (sum + Math.pow(Integer.valueOf(n.charAt(i)), i));
			System.out.println("sum is " + sum);
			
		}
		int value = 0;
		if( sum % 2 == 0 ) {
			value = sum - 1 ;  
		}else {
			value = sum / 2  ;
		}

		return value;
	}

}
