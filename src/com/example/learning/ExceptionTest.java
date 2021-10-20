package com.example.learning;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("A");
			int i = 9/0;
			System.out.println("B");
		}catch(Exception e) {
			System.out.println("C");
		}finally {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("d");
		}
	}

}
