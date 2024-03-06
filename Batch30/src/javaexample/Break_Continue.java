 package javaexample ;
 
 public class Break_Continue{
	 
	 public static void main(String args[]) {
		 for(int i = 1; i<=20 ; i++) {
			 if( i == 13)
//				 break;
				 continue;
			 
			 System.out.println(i);
		 }
	 }
 }