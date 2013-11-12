import javax.swing.JFrame;

public class DrawFanningLinesTest {

	public static void main(String[] args) {

		DrawFanningLines panel = new DrawFanningLines();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
		
	}

}
