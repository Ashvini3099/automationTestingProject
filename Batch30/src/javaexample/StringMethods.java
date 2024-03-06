package javaexample;

public class StringMethods {
	public static void main(String[] args) {
		String s = "python";
	
		System.out.println(s.length());
	
		String s1 = "python is ";
		String s2 = "language";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("python is ".concat("language"));
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		s3.contains("wel");
		s4.contains("come");
		
		System.out.println(s3.substring(0,3));
		System.out.println(s4.replace('e', 'a'));
		

	}
	

}
