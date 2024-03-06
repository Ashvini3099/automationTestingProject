package ashviniexample;

public class Else_if{
	public static void main(String[] args) {
		int interalMarks = 65;
		
if(interalMarks<50) {
			System.out.println("fail");
			
		}
		else if(interalMarks<=50 && interalMarks<=65) {
			System.out.println("C grade");
		}
			
			else if(interalMarks>=60 && interalMarks<70) {
				System.out.println("B grade");
		}
			else {
				System.out.println("A grade");
			}
	}
}
