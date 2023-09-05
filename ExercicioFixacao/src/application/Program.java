package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] vect = new Product[10];
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i);
			System.out.printf("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email:");
			String email = sc.next();
			System.out.printf("Room:");
			int room = sc.nextInt();
			vect[room] = new Product(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
