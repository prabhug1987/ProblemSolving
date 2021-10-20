package com.example.learning.string;

public class StringPermutation {

	public static void main(String[] args) {
	
		String str = "hello";
        permutation(str,0,str.length()-1);
	}
	
	public static void permutation(String str,int l,int r){
		if(l == r) {
			System.out.println(str);
		}else {
			for (int i = l; i <= r;i++) {
				str = swap(str,l,i);
				permutation(str,l+1,r);
				str = swap(str,l,i);
				
			}
		}
	}

	private static String swap(String a, int i, int j) {
		// TODO Auto-generated method stub
		char chars[] = a.toCharArray();
		char  temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		
		return String.valueOf(chars);
	}
}
