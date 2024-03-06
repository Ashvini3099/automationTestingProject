package javaexample;

public class Cond4 {
	
	public static void main(String args[]) {
		//DT     Var   VV 
		int a=40;
		int b=50;
		if(a==30) {
			if(b==40) {
				System.out.println("a value is 30 & b value is 40");
			}
			else {
			System.out.println("else stmt of 2nd condition");
			
			}
			
		}
		else {
			System.out.println("else stmt of 1st condition");
		}
	}

}
