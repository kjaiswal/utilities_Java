import java.util.Scanner;

public class Privacy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the four digit integer: ");
		int userInput = input.nextInt();
		
		Privacy p = new Privacy();
		
		/* Find ones, tens, hundred and thousand position number*/
		int[] inputNumber = p.findPositions(userInput);
		int[] outputNumber = new int[4];
				
		/*Replace each digit with the result of adding 7 to the digit and 
		 *getting the remainder after dividing the new value by 10. */  
		
		for(int i=0; i<4; i++){
			outputNumber[i] = p.processNumber(inputNumber[i]);
		}
		
		/*Swap the first digit with the third and second with fourth*/
		int tmp;
		
		tmp = outputNumber[2];
		outputNumber[2] = outputNumber[0];
		outputNumber[0] = tmp;

		tmp = outputNumber[3];
		outputNumber[3] = outputNumber[1];
		outputNumber[1] = tmp;

		System.out.printf("The new encrypted number is: %d%d%d%d\n", 
						  outputNumber[0],outputNumber[1],outputNumber[2],outputNumber[3]);
		
		//Decrypt the number

		/*Swap the first digit with the third and second with fourth*/
		tmp = outputNumber[2];
		outputNumber[2] = outputNumber[0];
		outputNumber[0] = tmp;

		tmp = outputNumber[3];
		outputNumber[3] = outputNumber[1];
		outputNumber[1] = tmp;

	}

	public int processNumber(int number){
		number += 7;
		return number % 10;
	}
	
	public int[] findPositions(int number){
		
		int ones = number % 10;

		int tens = number % 100;
		tens -= ones;
		tens /= 10;
		
		int hundred = number % 1000;
		hundred -= (10*tens);
		hundred -= (1*ones);
		hundred /= 100;
		
		int thousand = number % 10000;
		thousand -= (100*hundred);
		thousand -= (10*tens);
		thousand -= (1*ones);
		thousand /= 1000;

		return new int[] {thousand, hundred, tens, ones};
	}
}

