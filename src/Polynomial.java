import java.util.*;

public class Polynomial {
	private String polynomial = "";
	public int degree = 0;
	private ArrayList <Float> coefficients = new ArrayList<Float>();
	private Scanner scan = new Scanner(System.in);
	public void setPoly(String text){
		this.polynomial = text;
	}
	
	public String getPoly(){
		return polynomial;
	}
	
	public void getNewPoly(){
		System.out.println("Please enter a new polynomial.  To do an exponent, use ^");
		setPoly(scan.nextLine());
		parseInput();
	}
	public void parseInput(){
		
		String newPoly = this.polynomial.replace("-", "+-");
		String[] arr = polynomial.split("+");
		for (int i = 0; i < arr.length; i++){
			
		}
		
	}
	
	
	
	
}
