

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Numbers.*;

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
	
	//Parts of main page
	private JPanel top = new JPanel();
	private JPanel middle = new JPanel();
	private JPanel bottom = new JPanel();
	
	//Intro page:
	private JPanel topIntro = new JPanel();
	private JPanel bodyIntro = new JPanel();
	
	//Results page
	private JPanel resultHeader = new JPanel();
	private JPanel resultBottom = new JPanel();
	
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
		JTextField poly = new JTextField(17);
		top.add(poly);
		JTextField lf = new JTextField(15);
		middle.add(new JLabel("Linear Factor:"));
		middle.add(lf);
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	goCalculateAndInitiateNew(lf.getText(),poly.getText());
            }
        });  
		bottom.add(submit);
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
	
	public void makeResultPane(float f, String expr){
		JLabel remainder1 = new JLabel("The remainder is  "+ f);
		JLabel expressionOf = new JLabel(expr);
	}
	
	public void goCalculateAndInitiateNew(String lf, String poly){
		//Divide it and feed the result to makeResultPane to make the result
		Polynomial p = new Polynomial();
		p.setPoly(poly);
		p.parseInput();
		LinearFactor f = new LinearFactor();
		f.ParseFactor(lf);
		SyntheticDivider s = new SyntheticDivider(p,f);
		makeResultPane(s.getRemainder(),s.getRP());
	}
	
}
