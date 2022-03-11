package day23;

abstract class ShopAcc{
	 private int Accno;
	 private String  AccNm;
     private float charges;   
 
	public void setAccno(int i) {
		Accno = i;
	}	
	 public int getAccno()
	    {
			return Accno;
		}
    public void setAccNm(String j) {
    	AccNm = j;
    }
    public String gettAccNm() {
    	return AccNm ;
    }
    public void setcharges(float k) {
    	charges = k;
    }
    public float getcharges() {
    	return charges;
    }
      
    public abstract void bookproduct();
    
    public void items() {
    	
    }
    public abstract String toString();
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
