
public class LinearFactor {
	public float factor;
	public char varname;
	
	public void setVar(char var){
		varname = var;
	}
	public char getVar(){
		return varname;
	}
	
	public void setCoeff(float factor){
		this.factor = factor;
	}
	
	public float getFactor(){
		return factor;
	}
	
	public void ParseFactor(String expr, char var){
		
	}
}
