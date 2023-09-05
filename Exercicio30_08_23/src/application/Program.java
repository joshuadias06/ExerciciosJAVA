package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to the Bad Bank");
		System.out.println("Enter to Account number: ");
		int numAccount = sc.nextInt();
		System.out.println("Enter  your name: ");
		String name = sc.nextLine();
		Product product = new Product(numAccount,name);
		
		
		sc.close();
	}

}
