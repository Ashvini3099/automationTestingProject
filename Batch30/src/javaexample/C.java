package javaexample;

class D {

	float e = (float)(30.5);
	 float g = (float)(20.5);
	 

	public void m1() {
		System.out.println("m1 exeuted");

	}
}

class E extends D {
	float c = (float)(45.5);
	float d = (float)(50.5);

	public void m2() {
		System.out.println("m2 executed");
		System.out.println(c+d);
	}
}

public class C extends E {
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(c+d);// class E
		System.out.println(e+g);// class D
	}

	public static void main(String args[]) {
		C obj = new C();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
