package ashviniexample;

public class Do_While {
	public static void main(String[] args) {
		int num =158;
		int sum=0;
		int digit,sum1=0;
		int copy = num;
		do {
			digit=num%10;
			sum=sum+digit;
			num = num/10;
			
		}
		while(num!=0);
		System.out.println("the sum of the digit is:"+sum);
		//System.out.println("sum digit of "+copy+"is;"+sum);
	}

}
