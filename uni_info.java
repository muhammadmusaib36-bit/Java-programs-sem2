
//25CS036

import java.util.Scanner;

public class uni_info{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
	String dept;
	
	System.out.println(" Enter your University name ");
	 String uni_name = sc.next();
	 
	 	System.out.println("Enter your depatment ");
	 	  dept = sc.next();
	 	
	 		System.out.println("Enter quantity of students ");
	 		int quantity = sc.nextInt();
	 		
	for ( int i = 1 ; i <= quantity ; i++ ){
	    
	System.out.println("Roll number 25" + dept + " " + i );
	}



	}   	
	
}