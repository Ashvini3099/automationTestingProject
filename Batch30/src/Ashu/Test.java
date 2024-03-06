package Ashu;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(USbank.min_bal);
		
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.eduloan();
	}

}
