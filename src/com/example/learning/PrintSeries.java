package com.example.learning;

public class PrintSeries {
	public static void main(String[] args) {
		String str = "";
		int count = 26;
		for (char i = 'A' ; i <= 'Z'; i++) {
			if(((int)i) % 2 == 0)
				str += Character.toLowerCase(i)+""+count+",";
			else
				str += i+""+count+",";
			
			count--;
		}
		
		System.out.println(str);
		
		
	}
}
