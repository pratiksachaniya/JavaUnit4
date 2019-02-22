import java.applet.*;
import java.awt.*;

/*<Applet code="Cube.class" height="400" width="400"></Applet> */

public class Cube extends Applet
{
	public void paint(Graphics g)
	{
		int[] x = {193,104,104,193,282,282};
		int[] y = {66,133,230,300,230,133};
		
		g.drawPolygon(x,y,6);
		
		g.drawLine(104,133,193,200);
		g.drawLine(193,200,193,300);
		g.drawLine(282,133,193,200);
		
	}	
}