import java.util.*;
public class LinearFactor {
	
	private Scanner scan = new Scanner(System.in);
	//Scanner Init
	
	//Initialize the coefficient
	private float factor;

	/*
	 * @param factor: The factor to set the object's factor to
	 */
	public void setFact(float factor){
		//Set the factor
		this.factor = factor;
	}
	/*
	 * @return the factor
	 */
	public float getFactor(){
		return factor;
	}
	
	public void ParseFactor(String expr){
		if (!cleanUp(expr)){
			setFact(Integer.parseInt(expr.substring(1)));
		}
		else{
			setFact(Integer.parseInt(expr.substring(indexRet(expr))));
		}
	}
		
	public int indexRet(String expr){
		return expr.toLowerCase().indexOf("+".toLowerCase());
	}
	public boolean cleanUp(String in){
		return in.toLowerCase().contains("+".toLowerCase()); 
	}
	
	public void getNewLinearFactor(){

		System.out.println("Please enter a linear factor in the form of x - c.");
		String expr = scan.next();
		ParseFactor(expr);
	}
}
