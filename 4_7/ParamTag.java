import java.applet.*;
import java.awt.*;
/*<Applet code="ParamTag.class" height="200" width="200">
<param name="n1" value="10">
<param name="n2" value="20">
</Applet>*/
public class ParamTag extends Applet
{
	public void paint(Graphics g)
	{
		int n1 = Integer.parseInt(getParameter("n1"));
		int n2 = Integer.parseInt(getParameter("n2"));
		
		g.drawString("Average Is " + (n1+n2)/2 ,10,10);
		g.drawString("Sum Is " + (n1+n2) ,10,20);
	}
}