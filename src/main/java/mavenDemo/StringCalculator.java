package com.revature.mavenDemo;

public class StringCalculator {

//	Requirement 1: create a string calculator with a method int add
//	The method will take 0,1,2 and return their sum
//	Use comma as delimiter
	
	public static void main(String[] args){
		
	}
	
	public static int add(String numbers){
		int sum = 0;
		String[] numbersArray = numbers.split(",");
		
		if (numbersArray.length>2){
			throw new RuntimeException("too many number");
		}
		else{
			for (String number: numbersArray){
				if (!number.equals("")){
					sum += Integer.parseInt(number);
				} 
			}
		}
		return sum;
				
	}
}
