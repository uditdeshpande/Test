import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GUI extends JFrame implements ActionListener{
	int i;
	JPanel root,north,south,west,east;
	JMenu[] m;
	JMenuBar mb;
	JButton b1,b2;
	GUI()
	{
		setLayout(new BorderLayout());
		north=new JPanel();
		root=new JPanel();
		south=new JPanel();
		west=new JPanel();
		add(root,BorderLayout.CENTER);
		add(north,BorderLayout.NORTH);
		add(west,BorderLayout.WEST);
		add(south,BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setUI();
	
		setVisible(true);
		
		
	}
	public static void main(String []args)
	{
	new GUI();	
	}
	
	void setUI()
	{
	north.setLayout(new FlowLayout(FlowLayout.LEFT));
	addmenu();
	west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
	b1=new JButton("B1");b2=new JButton("B2");
	b1.addActionListener(this);b2.addActionListener(this);
	west.add(b1);
	west.add(b2);
	}
	void addmenu()
	{
		m=new JMenu[3];
		mb=new JMenuBar();
		m[0]=new JMenu("File");
		m[0].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 19));
		m[0].add(new JMenuItem("Save"));
		m[0].add(new JMenuItem("Exit"));
		m[1]=new JMenu("Settings");
		m[1].add(new JMenuItem("Preferences"));
		m[2]=new JMenu("Help");
		m[2].add(new JMenuItem("Updates"));
		m[2].add(new JMenuItem("About Us"));
		mb.add(m[0]);
		mb.add(m[1]);
		mb.add(m[2]);
		north.add(mb);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
	{
		west.removeAll();
		west.repaint();
	b2.setBackground(Color.BLACK);
	b1.setBackground(Color.GRAY);
		west.add(b2);
		west.add(b1);
	}
		
	}
	
}
