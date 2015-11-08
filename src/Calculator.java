import java.util.*;
import java.math.*;
public class Calculator {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearFactor lf = new LinearFactor();
		Polynomial poly = new Polynomial();
		lf.getNewLinearFactor();
		System.out.println(lf.getFactor());
		poly.getNewPoly();
		
	}

}
