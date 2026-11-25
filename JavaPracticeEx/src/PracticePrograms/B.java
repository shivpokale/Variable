package PracticePrograms;

public class B {
	
	B (){
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		
		B b = new B();
		B b1 = new B();
	}

}
