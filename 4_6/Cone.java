import java.applet.*;
import java.awt.*;

/*<Applet code="Cone.class" height="400" width="400"></Applet> */

public class Cone extends Applet
{
	public void paint(Graphics g)
	{
		g.fillOval(50,250,296,75);	
		int[] x = {197,50,345};
		int[] y = {23,285,286};
		
		g.fillPolygon(x,y,3);
	}	
}