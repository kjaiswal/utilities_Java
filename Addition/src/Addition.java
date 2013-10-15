//Using Scanner to get 2 integers and adding them

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int integerOne;
		int integerTwo;
		int sum;
		
		System.out.print("Enter first integer: ");
		integerOne = input.nextInt();
		
		System.out.print("Enter second integer: ");
		integerTwo = input.nextInt();
		
		input.close();
		sum = integerOne + integerTwo;
		
		System.out.println("The sum of two integers is: " + sum);
	}

}
