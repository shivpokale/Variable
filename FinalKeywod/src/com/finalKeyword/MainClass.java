package com.finalKeyword;

public class MainClass extends FinalVariable {
	
		@Override
		public void m1() {
			System.out.println("method logic changed");
		}
	
	public static void main(String[] args) {
		
		FinalVariable fv = new FinalVariable();
		System.out.println(fv.uid);
		System.out.println(fv.uName);
		System.out.println(fv.i);
		//fv.uid=342;
		//System.out.println(fv.uid);
		fv.m1();
		
		fv.m2(100, 200);
		
		
	}
	

}
