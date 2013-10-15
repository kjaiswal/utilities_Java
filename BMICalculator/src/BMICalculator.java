//Gets Height and weight and displays BMI to user

import java.util.Scanner;

public class BMICalculator {

	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double weight,
		       height,
		       bmi;
		try{
			System.out.print("Enter your weight in pounds: ");
			weight = in.nextDouble();

			System.out.print("Enter your height in inches: ");
			height = in.nextDouble();
		} finally {
			in.close();
		}
		
		bmi = (weight * 703) / (height * height);
		
		System.out.println("\nDepartment of Health and Human Services / NIH provided BMI values");
		System.out.println("BMI Values");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
		
		System.out.printf("Your BMI is: %f\n", bmi );
	}
	
}
