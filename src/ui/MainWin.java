package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWin extends JFrame{
	public MainWin() throws InterruptedException{
		startWin();
		mainScreenPanelMake();
		startScreenPanelMake();
		addHomePanels();
		window.show();
		
		
//		window.remove(top);
//		window.revalidate();
//		window.repaint();
			
		
	}
	//Main panel
	private JFrame window = new JFrame("A Synthetic Division Calculator");
	
	//Parts of page
	private JPanel top = new JPanel();
	private JPanel middle = new JPanel();
	private JPanel bottom = new JPanel();
	
	//Intro page:
	private JPanel topIntro = new JPanel();
	private JPanel bodyIntro = new JPanel();
	
	private final int HEIGHT = 300;
	private final int WIDTH = 400;
	
	//Set up the window
	public void startWin(){
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
	//	window.show();
		window.setLayout(new FlowLayout());
		
	}
	
	//Fill the content panels with content
	public void mainScreenPanelMake(){
		top.add(new JLabel("Polynomial:"));
		top.add(new JTextField(17));
		bottom.add(new JButton("Submit"));
	}
	public void startScreenPanelMake(){
		JLabel polyC = new JLabel("Synthetic Division Calculator");
//		polyC.setHorizontalAlignment(/2);
		topIntro.add(polyC);
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	removeHomePanels();
            	addMainPanels();
            	fixPane();
            }
        });  
		bodyIntro.add(start);
		
	}
	
	//Perform all the fixing actions 
	public void fixPane(){
		window.revalidate();
		window.repaint();
	}
	//Adds the main panels
	public void addMainPanels(){
		window.add(top);
		window.add(middle);
		window.add(bottom);
	}
	//Remove the main panels
	public void removeMainPanels(){
		window.remove(top);
		window.remove(middle);
		window.remove(bottom);
	}
	
	public void addHomePanels(){
		window.add(topIntro);
		window.add(bodyIntro);
	}
	
	public void removeHomePanels(){
		window.remove(topIntro);
		window.remove(bodyIntro);
	}
	
	
	
	
}
