package com.cal.Calculator;

import java.util.Scanner;

public class claculatorService {
	int input1;
	int input2;
	int result;
	Scanner scan = new Scanner(System.in);
	public void add() {
		System.out.println("Enter numbers1");
		input1 = scan.nextInt();
		System.out.println("Enter numbers");
		input2 = scan.nextInt();
		result = input1+input2;
		System.out.println("The result is " +result);
		
	}
//      public void Subtraction(int input1,int input2) {
//		
//		result = input1-input2;
//		System.out.println(result);
//		
//	}


}
