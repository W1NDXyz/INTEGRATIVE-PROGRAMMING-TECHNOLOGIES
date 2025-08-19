import java.awt.*;
import java.awt.event.*;

public class OC3_IPT_dialogBox extends Frame{
	public OC3_IPT_dialogBox(){
		
		//create frame title
		Frame f1 =  this;
		setTitle ("Devices Connection Feature");
		
		//create menu bar
		MenuBar mb1 = new MenuBar();
		
		//create menu nevigation
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Help");
		
		//create menu items in File
		MenuItem mi1 = new MenuItem("New");
		MenuItem mi2 = new MenuItem("Open");
		MenuItem mi3 = new MenuItem("Close");
		
		//create menu items in Insert
		MenuItem mi4 = new MenuItem("Tools");
		MenuItem mi5 = new MenuItem("Shape");
		Menu m4 = new Menu("Comment");
		
		//create menu items in Help
		MenuItem mi7 = new MenuItem("About");
		
		//create submenu item in Comment menu
		MenuItem mi8 = new MenuItem("Features");
		MenuItem mi9 = new MenuItem("Usage");
		Menu m5 = new Menu("Trobleshoot");
		
		//create submenu item in Trobleshoot submenu
		MenuItem mi11 = new MenuItem("via Phone");
		MenuItem mi12 = new MenuItem("via Email");
		MenuItem mi13 = new MenuItem("via Online");	
		
		
		/////////////////////////////////////////manage layout///////////////////////////////////////
		//add menu nevigation into menubar
		mb1.add(m1);
		mb1.add(m2);
		mb1.add(m3);
		
		//add menu item into File menu
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		//add menu item into Insert menu
		m2.add(mi4);
		m2.add(mi5);
		m2.add(m4);
		
		//add menu item into Help menu
		m3.add(mi7);
		
		//add menu item into Comment submenu
		m4.add(mi8);
		m4.add(mi9);
		m4.add(m5);
		
		//add menu item into Trobleshoot submenu
		m5.add(mi11);
		m5.add(mi12);
		m5.add(mi13);
		
		//add txt in frame page
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		p1.add(new Button("SUMMIT"));
		Panel p2 = new Panel();
		p2.add(new TextField(30));
		p2.add(new Button("SUMMIT"));
		Panel p3 = new Panel();
		p3.add(new TextField(30));
		p3.add(new Button("SUMMIT"));
		
		
		setLayout(new GridLayout(3, 1));
		add(p1);
		add(p2);
		add(p3);
		
		//dialog box
		mi13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Dialog d = new Dialog(f1,"Connection Status", true);
				d.setLayout(new FlowLayout());
				Label L1 = new Label("Please make sure your connection is in proper condition");
				Button btn4 = new Button("OK");
				btn4.addActionListener(ev -> d.setVisible(false));
				d.add(L1);
				d.add(btn4);
				d.setSize(350,150);
				d.setVisible(true);
			}
		});
		
		//Attach MenuBar
		setMenuBar(mb1);
		setSize(400,300);
		setVisible(true);
	}
		
	public static void main(String[]args){
		new OC3_IPT_dialogBox();
	}
}