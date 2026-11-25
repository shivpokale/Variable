package com.finalKeyword;

public class FinalVariable {
	
	final int uid=234;
	String uName="Shiv";
	final int i ;
	
	//here we can assign value to final variable 
	//by creating default constructor
	public FinalVariable() {
		i=567;
	}
	
	 public void m1() {
		System.out.println("FinalVariable method");
	}
	 
	 public void m2(int i, int k) {
		 System.out.println(i+" "+k);
		 i=1000;
		 k=2000;
	 }

}
