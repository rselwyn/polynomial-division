import java.util.*;

public class Polynomial {
	private String polynomial = "";
	//Plaintext poylnomial input
	private int degree = 0;
	//Degree of the polynomial
	//Coefficients
	private Scanner scan = new Scanner(System.in);
	
	private HashMap<Integer,Float> degreeWithTerm = new HashMap<Integer,Float>();
	private ArrayList<Float> polynomialCoefficientTerms = new ArrayList<Float>();
	
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
		//Set the degree
		
		pumpIntoMap(arr);
//		printMap(this.degreeWithTerm);
		//Add the data we have into the map

		/*
		 * Here is where the parsing needs to happen.  
		 */
		
		
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
	
	public void pumpIntoMap(String[] arr){
		//Add what we have into the list
		for (String eachIndex : arr){
			this.degreeWithTerm.put(getDegreeFromString(eachIndex), getCoeffFromString(eachIndex));
		}
		
		for (int i = 0; i<=this.degree; i++){
			if (this.degreeWithTerm.containsKey(i)){
				//It has it
				continue;
			}
			else{
				this.degreeWithTerm.put(i, (float) 0);
			}
		}
		pumpMapToList();
	}
	
	//Takes the hasmap and puts it into a list
	public void pumpMapToList(){
		for (int i = this.degree; i>=0; i--){
			this.polynomialCoefficientTerms.add(this.degreeWithTerm.get(i));
		}
		//for (float i : this.polynomialCoefficientTerms) System.out.print(i);
	}
	
	public ArrayList<Float> getCoeffs(){
		return this.polynomialCoefficientTerms;
	}
	
	//http://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
	/*
	 * @param mp:  The map
	 * Prints out all the values in a map
	 */
	public void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}

}
