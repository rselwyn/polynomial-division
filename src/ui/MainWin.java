package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class MainWin extends JFrame{
	public MainWin() throws InterruptedException{
		startWin();
		mainScreenPanelMake();
		
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
	public void startWin(){
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
	//	window.show();
		window.setLayout(new FlowLayout());
		
	}
	
	public void mainScreenPanelMake(){
		top.add(new JLabel("Polynomial:"));
		top.add(new JTextField(17));
		bottom.add(new JButton("Submit"));
	}
	//Perform all the fixing actions 
	public void fixPane(){
		window.revalidate();
		window.repaint();
	}
	public void addMainPanels(){
		window.add(top);
		window.add(middle);
		window.add(bottom);
	}
	public void removeMainPanels(){
		window.remove(top);
		window.remove(middle);
		window.remove(bottom);
	}
	
	
	
	
	
}
