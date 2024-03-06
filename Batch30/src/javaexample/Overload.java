package javaexample;

public class Overload {
	// DT Var 
	public void add(int a, int b ,int c) {
		System.out.println(a+b+c);
	}
	public static void main (String args[]) {
		Overload obj = new Overload();
		obj.add (10,20,30);
		
	}

}
