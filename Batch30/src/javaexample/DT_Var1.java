package javaexample;

public class DT_Var1 {
	
	float b=(float)30.67;//instance var
	static float c= (float)10.36;//static var 
	
	public void m1(){
		int a= 101;
		
		System.out.println("m1 executed");
		System.out.println(a+"localvar");
	}
	public void m2() {
		System.out.println("m2 executed ");
		System.out.println(b+"instance var");
		System.out.println(c+"static var");
	}
	public void m3() {
		System.out.println("m3 executed ");
		System.out.println(c+"static var");
	}
	
	public static void main (String args[]) {
		System.out.println("main method executed");
		//classname objectname = new classname ();
		DT_Var1    g   =new DT_Var1();
		g.m1();
		g.m2();
		g.m3();
	}
		
		
	}
	
	

	

