import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Arrays;

public class HealthProfile {

	//Private attributes
	private String firstName;
	private String lastName;
	private char gender;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private double height;
	private double weight;
	
	//Setter functions
	public void setFirstName(String fName){
		firstName = fName;
	}
	public void setLastName(String lName){
		lastName = lName;
	}
	public void setGender(char g){
		if(g == 'M' || g == 'F'){
			gender = g;
		}else{
			System.err.println("Not a valid gender!");			
		}
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
	public void setHeight(double h){
		if(h > 0){
			height = h;
		}else{
			System.err.println("Not a valid height!");
		}
	}
	public void setWeight(double w){
		if(w > 0){
			weight = w;
		}else{
			System.err.println("Not a valid weight!");
		}
	}
	
	//Getter functions
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public char getGender(){
		return gender;
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
	public double getHeight(){
		return height;
	}
	public double getWeight(){
		return weight;
	}
	//Default constructor
	public HealthProfile(String fName, String lName, char g, 
						 int day, int month, int year,
						 double h, double w){
		setFirstName(fName);
		setLastName(lName);
		setGender(g);
		setDOB(day);
		setMOB(month);
		setYOB(year);
		setHeight(h);
		setWeight(w);
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
	
	public double calculateBMI(){
		double bmi = (weight * 703) / (height * height);
		return bmi;
	}
	
	public static void main(String[] args) {
		// Prompt for user's information
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String fName = sin.next();

		System.out.println("Enter your last name: ");
		String lName = sin.next();

		System.out.println("Enter your gender: ");
		char g = sin.next().charAt(0);

		System.out.println("Enter your day of birth: ");
		int day = sin.nextInt();

		System.out.println("Enter your month of birth: ");
		int month = sin.nextInt();

		System.out.println("Enter your year of birth: ");
		int year = sin.nextInt();

		System.out.println("Enter your height in inches: ");
		double h = sin.nextDouble();

		System.out.println("Enter your weight in pounds: ");
		double w = sin.nextDouble();

		HealthProfile hp = new HealthProfile(fName, lName, g, day, month, year, h, w);
		
		System.out.printf("The user's name is %s %s !\n", hp.getFirstName(), hp.getLastName());
		System.out.printf("The user's gender is %c !\n", hp.getGender());
		System.out.printf("The user's date of birth is %d-%d-%d !\n", hp.getMOB(), hp.getDOB(), hp.getYOB());
		System.out.printf("The user's height is %.2f inches !\n", hp.getHeight());
		System.out.printf("The user's weight is %.2f pounds !\n", hp.getWeight());
		System.out.printf("The user's age is %.2f years !\n", hp.calculateAge());

		System.out.println("\nDepartment of Health and Human Services / NIH provided BMI values");
		System.out.println("BMI Values");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
		
		System.out.printf("Your BMI is: %.2f\n", hp.calculateBMI() );
		System.out.printf("The user's maximum heart rate is %.2f !\n", hp.calculateMaxHeartRate());
		System.out.printf("The user's target heart rate range is %s !\n", Arrays.toString(hp.calculateTargetHeartRate()));
		
	}

}
