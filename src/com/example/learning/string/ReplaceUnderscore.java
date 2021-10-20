package com.example.learning.string;

public class ReplaceUnderscore {

	public static void main(String[] args) {
		String str = "this_myVariable";
		replaceVariable(str);
		str = "ThisIsAVariable";
		replaceVariable(str);
	}

	private static void replaceVariable(String str) {
		// TODO Auto-generated method stub
		if (str.contains("_")) {
			String values[] = str.split("_");
			for (int i = 0; i < values.length; i++) {
				if (i > 0) {
					System.out.print(
							values[i].substring(0, 1).toUpperCase() + values[i].substring(1, values[i].length()));
				} else {
					System.out.print(values[i]);
				}
			}
		} else {
			System.out.println();
			System.out.println(str.replaceAll("(.)([A-Z])", "$1_$2"));
			
		}

	}

}
