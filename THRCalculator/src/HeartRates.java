import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Arrays;

public class HeartRates {

	//Private attributes
	private String firstName;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	//Setter functions
	public void setFirstName(String fName){
		firstName = fName;
	}
	public void setLastName(String lName){
		lastName = lName;
	}
	public void setDOB(int day){
		if(day <= 31 && day > 0){
			dayOfBirth = day;
		}else{
			System.err.println("Not a valid day of month!");
		}
	}
	public void setMOB(int month){
		if(month <= 12 && month > 0){
			monthOfBirth = month;
		}else{
			System.err.println("Not a valid month of year!");
		}
	}
	public void setYOB(int year){
		if(year <= Calendar.getInstance().get(Calendar.YEAR) && year > 0){
			yearOfBirth = year;
		}else{
			System.err.println("Not a valid year!");
		}
	}
	
	//Getter functions
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getDOB(){
		return dayOfBirth;
	}
	public int getMOB(){
		return monthOfBirth;
	}
	public int getYOB(){
		return yearOfBirth;
	}

	//Default constructor
	public HeartRates(String fName, String lName, int day, int month, int year){
		setFirstName(fName);
		setLastName(lName);
		setDOB(day);
		setMOB(month);
		setYOB(year);
	}
	
	//Calculate person's age
	public double calculateAge(){
		Calendar birthDate = new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth);
		Calendar nowDate   = new GregorianCalendar();
		
		double ageDiff = nowDate.getTimeInMillis() - birthDate.getTimeInMillis();
		ageDiff = ageDiff / (3.156 * Math.pow(10,10));
		
		return ageDiff;
	}
	
	public double calculateMaxHeartRate(){
		double mhr = 220 - calculateAge();
		return mhr;
	}
	
	public double[] calculateTargetHeartRate(){
		double minTHR = 0.5 * calculateMaxHeartRate();
		double maxTHR = 0.85 * calculateMaxHeartRate();
		return new double[] {minTHR, maxTHR};
	}
	
	public static void main(String[] args) {
		// Prompt for user's information
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String fName = sin.next();

		System.out.println("Enter your last name: ");
		String lName = sin.next();

		System.out.println("Enter your day of birth: ");
		int day = sin.nextInt();

		System.out.println("Enter your month of birth: ");
		int month = sin.nextInt();

		System.out.println("Enter your year of birth: ");
		int year = sin.nextInt();

		HeartRates hr = new HeartRates(fName, lName, day, month, year);
		
		System.out.printf("The user's name is %s %s !\n", hr.getFirstName(), hr.getLastName());
		System.out.printf("The user's date of birth is %d-%d-%d !\n", hr.getMOB(), hr.getDOB(), hr.getYOB());
		System.out.printf("The user's age is %.2f !\n", hr.calculateAge());
		System.out.printf("The user's maximum heart rate is %.2f !\n", hr.calculateMaxHeartRate());
		System.out.printf("The user's target heart rate range is %s !\n", Arrays.toString(hr.calculateTargetHeartRate()));
		
	}

}
	