import java.util.*;

public class Polynomial {
	private String polynomial = "";
	public int degree = 0;
	private ArrayList <Float> coefficients = new ArrayList<Float>();
	//Coefficients
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
		//Set the polynomial to the input
		setPoly(scan.nextLine());
		//Parse the input
		parseInput();
	}
	public void parseInput(){
		
		String newPoly = replacePlusMinus(getPoly());
		String[] arr = polynomial.split("\\+",10);
		//System.out.println(arr);
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
	public String replacePlusMinus(String text){
		return text.replace("-", "+-");
	}
	
	//Get the degree of the polynomial (from the first term only!)
	public int getDegree(String input){
		//Get the character at the last index of the term (The exponent)
		char asC = input.charAt(input.length()-1);
		//Return the value
		return (int) asC;
	}
	
	/*
	 * @param text: The term to get the leading term of 
	 * @return The value
	 */
	public float getCoeffFromString(String text){
		return (float) text.charAt(0);
	}
	
}
