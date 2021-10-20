package com.example.learning;

public class FindStairs {

	public static void main(String[] args) {
		int numberOfBlocks = 10;
		calculateStairsForBlocks(numberOfBlocks);
	}

	private static void calculateStairsForBlocks(int numberOfBlocks) {
		int i = 1;
		int remainingBlocks = numberOfBlocks;
		int numberOfStairs = 0;
		int sum = 0;
		
		while (i < remainingBlocks) {
			remainingBlocks = numberOfBlocks - sum;
			sum += i;
			numberOfStairs++;

			System.out.println("value of i is " + i);
			System.out.println("number of stairs " + numberOfStairs);
			System.out.println("remaining blocks " + remainingBlocks);

			if (remainingBlocks < i + 1) {
				break;
			}

			i++;
		}
		System.out.println(numberOfStairs);
	}

}
