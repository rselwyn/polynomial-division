import java.util.*;
public class SyntheticDivider {
	//The polynomial
	private Polynomial poly;
	//The LF
	private LinearFactor lf;
	//The coefficients in the remainder polynomial
	private ArrayList<Float> remainderTerms = new ArrayList<Float>();
	//The degree of the polynomial
	private int degree;
	//The remainder when polynomial/lf
	private int remainder;
	
	public SyntheticDivider(Polynomial p, LinearFactor l) {
		setPoly(p);
		setLF(l);
		this.degree = poly.getDegree();
		//Yay for no abstraction :(
		setRemainder(divide(poly.getCoeffs(),0));
		System.out.println("Remainder: "+this.remainder);
		for (int i=this.degree; i>0; i--){
			System.out.print(remainderTerms.get(this.degree-i)+"x^"+(i-1));
		}
	}
	
	/*
	 * @param Polynomial 
	 */
	public void setPoly(Polynomial p){
		this.poly = p;
	}
	
	//Get the polynomial object
	public Polynomial getPoly(){
		return this.poly;
	}
	
	public void setLF(LinearFactor l){
		this.lf = l;
	}
	
	//Get the linear factor term
	public LinearFactor getLF(){
		return this.lf;
	}
	
	//Set the remainder
	public void setRemainder(float r){
		this.remainder = (int) r;
	}
	
	
	public float divide(List<Float> nums, float result){
		if (nums.size()==0) return result;
		if (nums.size()==1){
			float num = nums.get(0);
//			System.out.println("COEFF:"+num);
//			System.out.println("NEW VAL Last:"+lf.getFactor()*num);
			nums.remove(0);
			return num+result;
		}
		//if no elements left, return the result
		
		if (result==0){
			float num = nums.get(0);
//			System.out.println("COEFF:"+num);
//			System.out.println("NEW VALa:"+lf.getFactor()*num);
			this.remainderTerms.add((float) num+result);
			nums.remove(0);
			return divide(nums,lf.getFactor()*num);
		}
		else{
			float num = nums.get(0);
//			System.out.println("COEFF:"+num);
//			System.out.println("NEW VAL:"+lf.getFactor()*(num+result));
			this.remainderTerms.add((float) num+result);
			nums.remove(0);
			return divide(nums,this.lf.getFactor()*(num+result));
		}
	}
	
	
	
	
	
	
}
