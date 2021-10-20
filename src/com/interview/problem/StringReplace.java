package com.interview.problem;

import java.util.Scanner;

public class StringReplace {
	
	public static void main(String[] args) {
	     //Scanner scanner = new Scanner(System.in);
	     //System.out.println("Enter the first String");
	     //String str1 = scanner.next();
	     //System.out.println("Enter the Second String");
	     //String str2 = scanner.next();
		 String str1 = "ABC";
		 String str2 = "BC";
		 StringReplace stringReplace = new StringReplace(); 
	     Result result = StringReplace.operation1(str1,str2);
	     System.out.println(result.operation1);
	     System.out.println(result.operation2);
	     StringReplace.operation2(str1,str2);
	     
	}

	private static Result operation2(String str1, String str2) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.operation1 = str1.replaceAll('/'+str2+'$',""); 
		result.operation1 = null;
		return result;
	}

	private static Result operation1(String str1, String str2) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.operation1 = str1.replaceAll("/^"+str2+"$",""); 
		return result;
	}
	
	

}
