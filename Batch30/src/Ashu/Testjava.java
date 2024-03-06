package Ashu;

public class Testjava {
	public static void main(String[] args) {
//		 static polymorphism ---- compile  time polymorphism 
        BMW b = new BMW();
		b.start();
		b.stop();
     	b.refuel();
     	System.out.println("******");
	
	Car obj = new Car();
	obj.start();
	obj.stop();
	obj.refuel();
	
	Car c1 = new BMW(); // child class object can be refered by parent class variable ---- 
//	Dynamic polymorphism --- Run time polymorphism
	
//	BMW says you refered my object but you can not give my properties and method 
	}

}
