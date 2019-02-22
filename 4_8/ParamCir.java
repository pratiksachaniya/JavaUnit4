import java.awt.*;
import java.applet.*;

/*<Applet code="ParamCir.class" width="500" height="500">
<param name="val" value="300">
</Applet>*/

public class ParamCir extends Applet 
{
	public void paint(Graphics g)
	{
		int r = Integer.parseInt(getParameter("val"));
		int sp = 250 - (r/2);
		int ep = 250 - (r/2);
		
		g.drawOval(sp,ep,r,r);
	}
}