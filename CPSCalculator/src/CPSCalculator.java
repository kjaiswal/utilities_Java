/**
 * Car Pool Savings calculator - Calculates user's cost per day 
 *  of driving to work 
 */

import java.util.Scanner;

/**
 * @author kjaiswal
 *
 */
public class CPSCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double mpd, //miles driven per day
		       cpg, //cost per gallon of gasoline
		       ampg, //average miles per gallon
		       pfees, //parking fees per day
		       tfees, //tolls per day
		       dfees, //driver salary per month
		       cpd; //user's cost per day
		
		try{
			System.out.print("Enter the total miles driven per day: ");
			mpd = in.nextDouble();
			
			System.out.print("Enter the cost per gallon of gasoline: ");
			cpg = in.nextDouble();
			
			System.out.print("Enter the average miles per gallon: ");
			ampg = in.nextDouble();
			
			System.out.print("Enter the parking fees per day: ");
			pfees = in.nextDouble();
			
			System.out.print("Enter the tolls per day: ");
			tfees = in.nextDouble();
			
			System.out.print("Enter the driver salary per month: ");
			dfees = in.nextDouble();
			
		}finally{
			in.close();
		}
		
		cpd = (cpg * mpd / ampg) + pfees + tfees + (dfees/22);
		
		System.out.printf("Your cost per day of driving to work is: %f\n", cpd);
	}//PSVMain

}//Class
