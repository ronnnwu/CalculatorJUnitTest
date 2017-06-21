package com.revature.mavenDemo;

public class App {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		LoggingClass logger = new LoggingClass();
		logger.someMethod();
		
		try{
			exceptionThrowingGarbage();
		}
		catch(RuntimeException e){
			logger.giveFatal(e);
			e.printStackTrace();
		}

	}
	
	static void exceptionThrowingGarbage(){
		int i = 5/0;
	}

}
