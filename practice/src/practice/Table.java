package practice;

import java.util.Scanner;

public class Table {
	//5. Java Program to Calculate Simple Interest.
	
	
	public static void main(String[] args) {
		double amount;
		double interest; // in percent
		int time; // in years
		double si;
		
		System.out.println("Enter follwoing details to calculate simple interest");
		Scanner sc =  new Scanner(System.in);
		 amount = sc.nextDouble();
		 interest = sc.nextDouble();
		 time = sc.nextInt();
		
		 si = (amount*interest*time)/100;
		 
		System.out.println("The total simple interest is: "+si);
	}

}
