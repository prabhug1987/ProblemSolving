package com.example.learning;

public class ReverseStringRetainPosition {

	public static void main(String[] args) {
		String str = "1X2Y3A4B";
		System.out.println("before " + str);
		char[] array = str.toCharArray();
		char result[] = new char[array.length];

		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i])) {
				result[i] = array[i];
			}else {
				result[i] = ' ';
			}
			//System.out.println("value of i is " + i);
			//System.out.println("result[i] is " + result[i]);
		}
		String str1 = new String(result);
		System.out.println("result after degit placement : " + str1.toString());

		int counter = 0;
		for (int i = array.length -1; i >= 0; i--) {
			//System.out.println(" value of i " + i);
			//System.out.println(" value of counter " + counter);
			System.out.println("value of  arr" + array[i]);
			System.out.println("value of  result" + result[counter]);
			System.out.println( "value is char "+ Character.isAlphabetic(array[i]));
			System.out.println( "character is digit " + Character.isDigit(result[counter]));
			
			
			if (Character.isAlphabetic(array[i]) && (!Character.isDigit(result[counter]))) {
				System.out.println(" value of counter " + counter);
				result[counter] = array[i];
				counter++;
			}
			if( Character.isAlphabetic(array[i]) && Character.isDigit(result[counter])) {
				System.out.println(" value of counter " + counter);
				counter++;
				
			}
		}
		
		System.out.println(result[counter]);

		str1 = new String(result);
		System.out.println("result after char placement " + str1.toString());
	}

}
