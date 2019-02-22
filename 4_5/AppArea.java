import java.awt.*;
import java.applet.*;
/*
<Applet code="AppArea.class" height="550" width="400">
</Applet>
*/
public class AppArea extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(20,20,150,20);
		g.drawString("Length Is 130",20,40);
		
		g.drawRect(20,60,200,200);
		g.drawString("Area Is  400",20,280);
		
		g.fillOval(20,300,200,200);
		g.drawString("Area Is  3140",20,530);
	}
}