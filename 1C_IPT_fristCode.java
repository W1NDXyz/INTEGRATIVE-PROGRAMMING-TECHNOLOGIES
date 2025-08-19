import java.awt.*;

public class FirstIPT extends Frame{
	
	public FirstIPT(){
		Label l1 = new Label("Username : ");
		Label l2 = new Label("Password : ");
		Panel p1 = new Panel();
		TextField t1a = new TextField(30);
		TextField t1b = new TextField(30);
		Button t2 = new Button ("Login");
		
		p1.add(l1);
		p1.add(t1a);
		p1.add(l2);
		p1.add(t1b);
		p1.add(t2);
		add(p1);
		setSize(400,500);
		setVisible(true);
	}
	public static void main (String[]args){
		new FirstIPT();
	}
}
