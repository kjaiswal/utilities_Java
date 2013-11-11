import java.util.Scanner;

public class GradeBook {

	private String courseName;
	
	public GradeBook (String name){
		courseName = name;
	}
	
	public void setCourseName(String name){
		courseName = name;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void displayMessage(){
		System.out.println("Welcome to " + courseName + " GradeBook!");
	}
	
	public static void main(String [] args){
		System.out.println("Hello World!");
	}
	
	public void determineCounterClassAverage(){
		
		double gradeTotal = 0,
			   average    = 0,
			   counter    = 1;
		
		Scanner input = new Scanner(System.in);

		while (counter <= 10){
			System.out.println("Enter the grade: ");
			gradeTotal += input.nextDouble();
			counter++;
		}
		
		average = gradeTotal / counter;
		
		System.out.printf("The class average is: %.2f \n", average);
	}
	
	public void determineSentinalClassAverage(){
		double gradeTotal   = 0,
			   gradeCounter = 0,
			   grade        = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter grade or -1 to exit: ");
		grade = input.nextDouble();
		
		while ( grade != -1){
			gradeTotal += grade;
			gradeCounter++;
			
			System.out.println("Enter grade or -1 to exit: ");
			grade = input.nextDouble();			
		}
		
		System.out.printf("The class average is: %.2f \n", gradeTotal/gradeCounter);		
	}
}
