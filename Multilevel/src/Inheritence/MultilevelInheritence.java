package Inheritence;

public class MultilevelInheritence {
	
	public static void main(String[]args) {
		
		D b =new D();
		b.printA();
		b.printB();
		b.printC();
		b.printD();		
	}

}

 class A{
	
	protected void printA() {
		
		System.out.println("PrintA method.");
		
	}
}

class B extends A {
	
	public void printB() {
		
		System.out.println("PrintB Method.");
	
	}

}

class C extends B {
	
	public void printC() {
		
		System.out.println("PrintC Method.");

	}	
}

class D extends C {
	
	public void printD() {
		
		System.out.println("PrintD Method.");
	
	}
}
