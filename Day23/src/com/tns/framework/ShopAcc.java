package com.tns.framework;

public abstract class ShopAcc {
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
    this.accNo = accNo;
	this.setAccNm(accNm);
	this.charges = charges;
        }

	private int accNo;
	private String accNm;
	private float charges;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public  void bookproduct(float charges) {
		System.out.println("Product booked and charges are:"+charges);
		
	}
	public  void items(float charges) {
		System.out.println("Items are delivered with charges:"+charges);
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm =" + getAccNm() + ",charges="+charges+" getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
