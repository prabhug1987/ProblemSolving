package com.example.learning;

import java.util.Random;
/**
 * 
 * @author Prabhu G
 *
 */
//to generate a 6 digit random value
public class GenerateRandomToken {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		final Random rnd = new Random();
		int n;
		do {
			n = rnd.nextInt(999999);
		} while (containsRepeatingDigits(n));
		
		System.out.println(n);
	}

	/**
	 * 
	 * @param accept n as a random value 
	 * @return a boolean value which contains duplicate number or not
	 */
	private static boolean containsRepeatingDigits(final int n) {
		final boolean digits[] = new boolean[10];
		for (char c : String.valueOf(n).toCharArray()) {
			final int i = c - '0';
			if (digits[i])
				return true;
			digits[i] = true;
		}

		return false;
	}

}
