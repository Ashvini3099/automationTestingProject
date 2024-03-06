package ashviniexample;

public class Testoperator {
	public static void main(String args[]) {
		int num1;// num1 can store integer 
		double num2;//num 2 can store decimal value 
		num1 =10;
		num2 =5.0;
		// performing arithematic operation 
		System.out.println(num1+"+"+num2+":"+(num1+num2));
		System.out.println(num1+"-"+num2+":"+(num1-num2));
		System.out.println(num1+"x"+num2+":"+(num1*num2));
		System.out.println(num1+"/"+num2+":"+(num1/num2));
		System.out.println(num1+"%"+num2+":"+(num1 % num2));
		System.out.println();
		
		// performing relational operations
		
		System.out.println(num1+">"+num2+":"+(num1 > num2));
		System.out.println(num1+"<"+num2+":"+(num1 < num2));
		System.out.println(num1+">="+num2+":"+(num1 >= num2));
		System.out.println(num1+"<="+num2+":"+(num1 <= num2));
		System.out.println(num1+"=="+num2+":"+(num1 == num2));
		System.out.println(num1+"!="+num2+":"+(num1 != num2));


	}
	
}
