import java.util.*;
public class LinearFactor {
	
//	public LinearFactor(float fact, char v){
//		setVar(v);
//		setFact(fact);
//	}
	private Scanner scan = new Scanner(System.in);
	private float factor;
	private char varname;
	
	public void setVar(char var){
		varname = var;
	}
	public char getVar(){
		return varname;
	}
	
	public void setFact(float factor){
		this.factor = factor;
	}
	
	public float getFactor(){
		return factor;
	}
	
	public void ParseFactor(String expr, char var){
		this.varname = var;
		
		if (expr.charAt(0) == var){
			try{
				setFact(Integer.parseInt(expr.substring(1)));
			}
			catch (Exception e){
				setFact(Integer.parseInt(expr.substring(1).replaceAll("\\s+","")));
			}
		}
		
	}
	
	public void getNewLinearFactor(){
		System.out.println("What is your variable character?");
		char which = scan.next().charAt(0);
		System.out.println("Please enter a linear factor in the form of x - c.");
		String expr = scan.next();
		ParseFactor(expr, which);
	}
}
