package com.example.learning.string;

public class CountChars {

	public static void main(String[] args) {
		String str = "aabbcccdd";
		counting(str);
	}

	private static void counting(String str) {
		// TODO Auto-generated method stub
		char[] charsCount = new char[128];
		for (int i = 'a'; i <= 'z'; i++) {
			charsCount[i] = 0;
		}

		for (int i = 0; i < str.length(); i++) {
			charsCount[str.charAt(i)]++;
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+ " "+charsCount[i]);
		}
	}

}
