package javaexample;

public class Override1 extends Override {
	public void add(int a, int b) {
		System.out.println(a-b);
		System.out.println("child - new car");
	}
	public static void main (String args[]) {
		Override1 obj =new Override1();
		obj.add(10,20);
		
	}

}
