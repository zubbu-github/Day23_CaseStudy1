package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	private float deliveryCharges;
	 
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	public void bookproduct(float charges) {
		
		 System.out.println("Charges are:"+ deliveryCharges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", isPrime()=" + isPrime()
				+ ", getDeliveryCharges()=" + getDeliveryCharges() + ", getCharges()=" + getCharges() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
