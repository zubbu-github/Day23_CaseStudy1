package day23;

 abstract class NormalAcc extends ShopAcc {
	
	private final float deliveryCharges = 10;

	abstract public void bookproduct();
	abstract public String toString();
	
	
	 public NormalAcc(int AccNo, String AccNm, float charges, float deliveryCharges) {
			
	 }
}
