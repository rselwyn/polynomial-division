import java.util.*;
public class SyntheticDivider {
	private Polynomial poly;
	private LinearFactor lf;
	private int degree;
	
	public SyntheticDivider(Polynomial p, LinearFactor l) {
		setPoly(p);
		setLF(l);
		this.degree = poly.getDegree();
		System.out.println(divide(poly.getCoeffs(),0));
		//Yay for no abstraction :(
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
	
	public LinearFactor getLF(){
		return this.lf;
	}
	
	public float divide(List<Float> nums, float result){
		if (nums.size()==0) return result;
		if (nums.size()==1){
			float num = nums.get(0);
			System.out.println("COEFF:"+num);
			System.out.println("NEW VAL Last:"+lf.getFactor()*num);
			nums.remove(0);
			return num+result;
		}
		//if no elements left, return the result
		
		if (result==0){
			float num = nums.get(0);
			System.out.println("COEFF:"+num);
			System.out.println("NEW VALa:"+lf.getFactor()*num);
			nums.remove(0);
			return divide(nums,lf.getFactor()*num);
		}
		else{
			float num = nums.get(0);
			System.out.println("COEFF:"+num);
			System.out.println("NEW VAL:"+lf.getFactor()*(num+result));
			nums.remove(0);
			return divide(nums,this.lf.getFactor()*(num+result));
		}
	}
	
	
	
	
	
	
}
