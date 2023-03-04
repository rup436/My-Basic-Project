package com.csi.bankApp;

public class OtpReaserch {
	public static void main(String[] args) {
		int otp = (int)((Math.random()*2000)+1000);//Math is class, random is method in math class 
		//random method is static method and if you multiply by random method into 
		//2000 (any value)then its convert 4 digit and 3 digit otp and but there is 
		//one problem if  we have  4 digit otp  you have add 1000 then you will convert into otp 4 digit otp
		System.out.println(otp);
	}
}
