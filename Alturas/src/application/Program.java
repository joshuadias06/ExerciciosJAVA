package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		Product vect[] = new Product[n];
		
		for(int i = 0 ; i < vect.length ; i++) {
			System.out.println("Digite o nome da " + i + " pessoa");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite a idade da " + i + " pessoa");
			System.out.println();
			int idade =sc.nextInt();
			System.out.println("Digite a altura da " + i + " pessoa");
			System.out.println();
			double altura = sc.nextDouble();
			vect[i] = new Product(name, idade, altura);
		}
		
		double somaAltura = 0.0;
		
		for(int i = 0; i< vect.length; i++) {
			somaAltura += vect[i].getAltura();
		}
		double mediaAltura = somaAltura / n;
		
		int cont = 0;
		
		for(int i = 0; i< vect.length; i++) {
			if(vect[i].getIdade()< 16) {
				cont+=1;
			}
		}
		double idadeMedia = ((double)cont / n) * 100.0;
		
		System.out.println("A media das alturas e: " + mediaAltura);
		System.out.println("A pocentagem de pessoas menores que 16 anos e: " + idadeMedia);		
		
		sc.close();
	}

}
