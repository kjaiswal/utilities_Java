
public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook gb = new GradeBook("Perl");
		gb.displayMessage();
		
		GradeBook gb1 = new GradeBook("C++");
		gb1.displayMessage();
		gb1.setCourseName("Java");
		gb1.displayMessage();
	}

}
