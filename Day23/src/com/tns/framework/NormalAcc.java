package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	
	protected static float deliveryCharges = 50;
	
	public  float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges = deliveryCharges;
	}
	
	 public void bookproduct(float charges) {
		 System.out.println("Charges are:"+ deliveryCharges);

	 }
	
	@Override
	public String toString() {
		return "NormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
