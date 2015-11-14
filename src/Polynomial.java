import java.util.*;

public class Polynomial {
	private String polynomial = "";
	//Plaintext poylnomial input
	private int degree = 0;
	//Degree of the polynomial
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
	
	/*
	 * @return: The polynomial
	 */
	public String getPoly(){
		return this.polynomial;
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
		String[] arr = newPoly.split("\\+",10);
		for (String boss : arr) System.out.println(boss);
		//System.out.println(arr);
		setdegree(getDegree(arr[0]));

	}
	
	/*
	 * @param text: The text to replace '-' with '+-'
	 * @return The new string
	 */
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
