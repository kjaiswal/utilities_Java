//World Population Growth Calculator - calculates population growth
//after one, two, three, four and five years.

import java.util.Scanner;

public class WPGCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int currentPopulation;
		double growthRate;
		
		try{
			System.out.print("Enter the current world population: ");
			currentPopulation = in.nextInt();
			
			System.out.print("Enter the annual world population growth rate: ");
			growthRate = in.nextDouble();
		}finally{
			in.close();
		}
		
		WPGCalculator calci = new WPGCalculator();
		
		System.out.printf("World population after one year would be: %d\n", calci.computePopulation(currentPopulation, growthRate, 1));
		System.out.printf("World population after two years would be: %d\n", calci.computePopulation(currentPopulation, growthRate, 2));
		System.out.printf("World population after three years would be: %d\n", calci.computePopulation(currentPopulation, growthRate, 3));
		System.out.printf("World population after four years would be: %d\n", calci.computePopulation(currentPopulation, growthRate, 4));
		System.out.printf("World population after five years would be: %d\n", calci.computePopulation(currentPopulation, growthRate, 5));
		
		
	}
	
	
	public int computePopulation(int currentPopulation, double growthRate, int year ) {
		
		for(int i=1; i<=year; i++){
			currentPopulation += currentPopulation * growthRate;
		}
		
		return currentPopulation;
	}

}
