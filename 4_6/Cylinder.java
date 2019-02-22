import java.applet.*;
import java.awt.*;

/*<Applet code="Cylinder.class" height="400" width="300"></Applet> */

public class Cylinder extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(50,50,200,60);
		g.drawOval(50,270,200,60);
		
		g.drawLine(50,80,50,300);
		g.drawLine(250,80,250,300);
	}	
}