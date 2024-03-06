package ashviniexample;
import java.util.Scanner;

public class CurrentDay {
	public static void main(String args[]) {
		System.out.println("Enter your choice");
		Scanner sc= new Scanner(System.in);
		String choice=sc.next();
		switch (choice){
		case "monday":
			System.out.println("today is monday");
			break;
		case "tuesday":
			System.out.println("today is tuesday");
		
			break;
		case "wednesday":
			System.out.println("today is wednesday");
			break;
		case "thursday":
			System.out.println("today is thursday");
			break;
		case  "friday":
			System.out.println("todat is friday");
			break; 
		case "Saturday":
			System.out.println("today is saturday");
			break;
		case "sunday":
			System.out.println("today is sunday");
			break;
			default:
				System.out.println("invalid choice");
				
			
		}
	}
	

}
