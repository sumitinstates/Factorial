package com.sumit;

public class Factorial {
	
	static int num = 5;
	static int count = 0;
	static int result = 1;
	
	public static void main(String[] args) {
		int temp = num;
		
		while(count < num) 
		{
			result = temp * result;
			temp--;
			count++;
		}
		
		System.out.println(" Factorial of " +  num + " is " + result);
		
	}

}
