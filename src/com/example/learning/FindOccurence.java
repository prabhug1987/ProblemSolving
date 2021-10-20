package com.example.learning;

public class FindOccurence {

	public static void main(String[] args) {
		String str = "helloasdfsadfhelloasdfsadfhello";
		String fintStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
			System.out.println(lastIndex);
			lastIndex = str.indexOf(fintStr, lastIndex);
			System.out.println(lastIndex);
			
			if (lastIndex != -1) {
				count++;
				lastIndex += fintStr.length();
			}
		}

		System.out.println(count);

	}
}
