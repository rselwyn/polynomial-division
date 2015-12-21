import java.util.*;

import Numbers.LinearFactor;
import Numbers.Polynomial;
import Numbers.SyntheticDivider;


import java.math.*;
public class Calculator{
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MainWin mainWindow = new MainWin();
		
		LinearFactor lf = new LinearFactor();
		Polynomial poly = new Polynomial();
		lf.getNewLinearFactor();
		System.out.println(lf.getFactor());
		poly.getNewPoly();
		SyntheticDivider div = new SyntheticDivider(poly,lf);
		
	}

}
