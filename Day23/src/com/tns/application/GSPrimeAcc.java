package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private static final float Charges = 50;
	
	public float getCharges() 
	{
		return Charges;
	}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	
	}
	public void bookproduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}

}
