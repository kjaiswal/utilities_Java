import javax.swing.JOptionPane;

public class IntAddDialog {

	public static void main(String[] args) {
		// Addition of two integers
		
		String intOneString = JOptionPane.showInputDialog("Enter first integer");
		String intTwoString = JOptionPane.showInputDialog("Enter second integer");
		
		int one = Integer.parseInt(intOneString);
		int two = Integer.parseInt(intTwoString);
		
		String message = String.format("The sum of two integers is %d", one + two);
		JOptionPane.showMessageDialog(null, message);
	}

}
