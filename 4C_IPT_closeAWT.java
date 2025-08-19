
import java.awt.*;
import java.awt.event.*;


public class C4_IPT_closeAWT extends Frame{
	public C4_IPT_closeAWT(){
		Panel a = new Panel();
		Button b = new Button("Click Me");
		TextField c = new TextField(30);
		Label d = new Label("Key in your IC:");
		a.add(d);
		a.add(c);
		a.add(b);
		add(a);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{public void windowClosing(WindowEvent we){
			System.exit(0);
			}	
		});
	}
	public static void main(String[]args){
		new C4_IPT_closeAWT();
	}
}
