package Ashu;

public class Function{
	public static void main(String[] args ) {
		Function obj = new Function();
		obj.test();
		 int c =obj.par();
		System.out.println(c);
		 String s1= obj.qa();
		 System.out.println(s1);
		 int d = obj.division(30, 10);
		 System.out.println(d);
		 }
	 public void test() {
		 System.out.println("test method");
	 }
	 public int par() {
		 int a = 25;
		 int b = 20;
		 int c = 30;
		 return c;
	 }
	 public String qa() {
		 String s = "Selenium";
		 return s;
		 
	 }
	 public  int division(int x , int y ) {
		 int d = x/y;
		 return d;
	 }
}