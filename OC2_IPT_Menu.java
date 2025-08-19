import java.awt.*;

public class OC2_IPT_Menu extends Frame{
	
	public OC2_IPT_Menu(){
		
		//create frame with title
		super("Basic Menu App");
		
		//create MenuBar
		MenuBar mb1 = new MenuBar();
	
		//create Menus
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Help");
		
		//create Menu Items in "File" Menu
		MenuItem mi1 = new MenuItem ("New");
		MenuItem mi2 = new MenuItem ("Open");
		MenuItem mi3 = new MenuItem ("Exit");
		
		//Add items to file menu
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		//Add Menus to MenuBar
		mb1.add(m1);
		mb1.add(m2);
		mb1.add(m3);
		
		//Attach MenuBar to Frame
		setMenuBar(mb1);
		setSize(400,300);
		setVisible(true);
	}
		
	public static void main(String[]args){
		new OC2_IPT_Menu();	
	}
}