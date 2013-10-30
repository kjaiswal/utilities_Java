
public class AccountTest {

	public static void main(String[] args) {
		
		System.out.println("Initialising account one with amount 23.78");
		System.out.println("Initialising account two with amount 55.23");
		Account accOne = new Account(23.78);
		Account accTwo = new Account(55.23);

		System.out.printf("The amount in account one is: %.2f\n", accOne.getBalance());
		System.out.printf("The amount in account two is: %.2f\n", accTwo.getBalance());
		
		System.out.println("Adding 20.01 amount to account one");
		accOne.credit(20.01);
		
		System.out.printf("The amount in account one is: %.2f\n", accOne.getBalance());
		System.out.printf("The amount in account two is: %.2f\n", accTwo.getBalance());

		System.out.println("Adding 98.21 amount to account one");
		accTwo.credit(98.21);
		
		System.out.printf("The amount in account one is: %.2f\n", accOne.getBalance());
		System.out.printf("The amount in account two is: %.2f\n", accTwo.getBalance());
		
	}

}
