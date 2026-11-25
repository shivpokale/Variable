package PracticePrograms;

public class P {
	
	Q  q = new Q();
	
	public P() {
		System.out.println(11);
	}
	{
		System.out.println("non static block of P");
	}
	static {
		System.out.println("static block of P");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		P p = new P();
	}

}
