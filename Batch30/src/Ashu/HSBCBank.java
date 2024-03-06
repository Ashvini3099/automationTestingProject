package Ashu;

public class HSBCBank implements USbank {
	
//	If a class is implementing of interface its mandatory to define all methods from interface.
	
	public void credit() {
		System.out.println("hsbc --- credit");
	}
     public void debit() {
    	 System.out.println("hsbc --- debit");
     }
     public void transfermoney() {
    	 System.out.println("transfer money");
     }
     public void eduloan() {
    	 System.out.println("education --- loan");
     }
     public void carloan() {
    	 System.out.println("Car --- loan");
     }
}
