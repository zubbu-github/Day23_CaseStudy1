package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.PrimeAcc;

public class Client {

	public static void main(String[] args) {
//	
//		GSShopFactory gssfactory = new GSShopFactory();
//		gssfactory.getNewPrimeAcc(151, "Zubeir", 1000, true);
//		gssfactory.getNewNormalAcc(123, "Gambhir", 1000, 50);
//		
		GSPrimeAcc gsprime = new GSPrimeAcc(151, "Zubeir", 1000, true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		
		gsprime.bookproduct(1000);
		gsprime.toString();
		

		GSNormalAcc gsnormal = new GSNormalAcc(123, "Gambhir", 1000, 50);
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		
		gsnormal.bookProduct(1000);
		gsnormal.toString();
	}

}
