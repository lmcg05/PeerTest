package com.qa.peerexcercise;

public class Factorial {
	public String getFactorial(int total) {
		int factorial = 1; //setting the factorial start at 1
		int a = 1; //and a initialises at 1
		
		while (factorial<total) { //while loop generates a loop when it reaches a point where the num is greater than the number it would break and stop
			 a = a + 1; //sets the parameter. on a factorial, u add 1 each increments
			 factorial = factorial*a; //factorial = the product of an integer and all the integers below it
		}
		if (factorial== total) { 
			return "This " + total +" is a factorial and it is " +a + "!"; 
		}else {
			return "This" + total + "is not a factorial";
			 
			//if statement allows us to set conditions whether the factorial is equal to the total. and if not a return would be initiated
		}
	}
}
