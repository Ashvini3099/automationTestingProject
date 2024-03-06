package javaexample;
abstract class Bank{
	abstract void debit();
	abstract void credit();

}
class Hdfc extends Bank{
	public void debit() {
		System.out.println("HDFC debit");
	}
	public void credit() {
	System.out.println("HDFC credit");
}
}		
		
	
class Icici extends Bank{
	public void debit() {
		System.out.println("Icici debit");
		
	}
	public void credit() {
	System.out.println("Icici credit");
	}
}
public class TestBank {
	public static void main(String args[]) {
		Hdfc  hd = new Hdfc();
		hd.debit();
		hd.credit();
		Icici ic = new Icici();
		ic.debit();
		ic.credit();
	}

}
