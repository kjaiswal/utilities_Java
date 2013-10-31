import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your name");
		
		String message = String.format("Welcome to Java's Swing,  %s", name);
		
		JOptionPane.showMessageDialog(null, message);
		
	}

}
