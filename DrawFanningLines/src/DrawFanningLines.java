import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawFanningLines extends JPanel {

	public void paintComponent( Graphics g ){
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		for(int i=0; i < width; i+=15){
			g.drawLine(0, 0, i, height-i);				
			g.drawLine(0, height, i, i);				
			g.drawLine(width, height, i, height-i);				
			g.drawLine(width, 0, i, i);				
		}
	}
	
}
