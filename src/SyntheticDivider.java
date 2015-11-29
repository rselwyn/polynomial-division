import java.util.*;
public class SyntheticDivider {
	private Polynomial poly;
	private LinearFactor lf;
	
	public SyntheticDivider(){
		
	}
	
	public void setPoly(Polynomial p){
		this.poly = p;
	}
	public Polynomial getPoly(){
		return this.poly;
	}
	
	public void setLF(LinearFactor l){
		this.lf = l;
	}
	
	public LinearFactor getLF(){
		return this.lf;
	}
	
	public float getFactorFromLinearFactor(){
		return this.lf.getFactor();
	}
	
	
}
