import java.awt.*;
import java.applet.*;

/*<Applet code="Rect5Part.class" width="700" height="400"></Applet>*/

public class Rect5Part extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawRect(100,100,500,200);
		
		g.drawLine(200,100,200,300);
		g.drawLine(300,100,300,300);
		g.drawLine(400,100,400,300);
		g.drawLine(500,100,500,300);
	}
}