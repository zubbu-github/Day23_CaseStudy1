package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{	
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
        return gsprime;

	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliverycharges)
	{
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, deliverycharges, deliverycharges);
		return gsnormal;

	}

}
