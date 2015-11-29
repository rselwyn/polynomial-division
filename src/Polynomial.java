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
	 * @return: The polynomial3
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
		//for (String boss : arr) System.out.println(boss);
		//for (String degs : arr) System.out.println(getDegreeFromString(degs));
		
		setdegree(getDegreeFromString(arr[0]));
		//System.out.println(getDegree());
		//Set the degree
		for (int i = this.degree; i>=0; i--){
			boolean found = false;
			for (String each : arr){
				if(lookForTheTerm(each,i)){
					try{
					coefficients.add(getCoeffFromString(arr[i]));
					}
					catch (Exception e){
						
					}
					found = true;
					break;
				}			
			
			}
			if(!found){
				coefficients.add((float) 0);
			}
			
		}
		
		
		/*
		 * Here is where the parsing needs to happen.  
		 */
		
		fixList();
		//Print out the coefficient list
		for (Float t: coefficients) System.out.println(t);
		
	}
	
	public Boolean lookForTheTerm(String term, int lookFor){
		if (getDegreeFromString(term)==lookFor){
			return true;
		}
		return false;
	}
	
	/*
	 * @param text: The text to replace '-' with '+-'
	 * @return The new string
	 */
	public String replacePlusMinus(String text){
		return text.replace("-", "+-");
	}
	
	//Get the degree of the polynomial (from the first term only!)
	public int getDegreeFromString(String input){
		//Get the character at the last index of the term (The exponent)
		String[] arr = input.split("");
		return Integer.parseInt(arr[arr.length - 1]);
		//Return the value
	}
	
	/*
	 * @param text: The term to get the leading term of 
	 * @return The value
	 */
	public float getCoeffFromString(String text){
		String[] arr = text.split("");
		return Integer.parseInt(arr[0]);
	}
	
	
	public void fixList(){
		Collections.reverse(coefficients);
	}
	
}
