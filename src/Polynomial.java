import java.util.*;

public class Polynomial {
	private String polynomial = "";
	public int degree = 0;
	private ArrayList <Float> coefficients = new ArrayList<Float>();
	private Scanner scan = new Scanner(System.in);
	
	public void setdegree(int deg){
		this.degree = deg;
	}
	
	public int getDegree(){
		return this.degree;
	}
	
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
		String[] arr = polynomial.split("\\+",10);
		System.out.println(arr);
		setdegree(getDegree(arr[0]));
		for (int i = 0; i < arr.length; i++){
			if(getDegree(arr[i]) == this.degree - i){
				coefficients.add(getCoeffFromString(arr[i]));
			}
			else{
				coefficients.add((float) 0);
			}
		}
		for (Float temp : coefficients) {
			System.out.println(temp);
		}
	}
	
	public int getDegree(String input){
		char asC = input.charAt(input.length()-1);
		return (int) asC;
	}
	
	public float getCoeffFromString(String text){
		return text.charAt(0);
	}
	
}
