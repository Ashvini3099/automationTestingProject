package Ashu;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
	public static void main(String[] args) {
		
		int a[] = new int[3];
		
		ArrayList ar = new ArrayList();
		 ar.add(10, ar);
		 ar.add(20, ar);
		 System.out.println(ar.size());
		 
//		 ArrayList<E> ar1 =  new ArrayList<E>();
//		  Empolyee Class object 
		 Empolyee e1 = new Empolyee("Ashu",25,"QA");
		 Empolyee e2 = new Empolyee("Madhu",26,"Dev");
		 Empolyee e3 = new Empolyee("Mohini",27,"Admin");
		 
		 ArrayList<Empolyee> ar2 = new ArrayList<Empolyee>();
		 ar2.add(e1);
		 ar2.add(e2);
		 ar2.add(e3);
		 
//		  to iterator tranverse the value 
		 Iterator<Empolyee> it =  ar2.iterator();
		 while(it.hasNext()) {
			 Empolyee emp = it.next();
			 System.out.println(emp.name);
			 System.out.println(emp.age);
			 System.out.println(emp.dept);
		 }
	}

}
