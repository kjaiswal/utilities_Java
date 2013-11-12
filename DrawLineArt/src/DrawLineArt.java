import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLineArt extends JPanel{

	public void paintComponent( Graphics g ){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		for (int i=0; i < width; i+=15){
			g.drawLine(0, i, i+15, height);		
			g.drawLine(0, height-i, i+15, 0);		
			g.drawLine(width, i, width-i, height);		
			g.drawLine(width, height-i, width-i, 0);		
		}
	}
	
}
