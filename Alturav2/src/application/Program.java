package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[]nomes = new String[n];
		int[]idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0 ; i < n; i++) {
			System.out.printf("Nome: ");
			nomes[i] = sc.next();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double cont = 0;
		
		for(int i = 0; i< idade.length;i++) {
			if( idade[i] < 16) {
				cont ++;
			}
		}
		double mediaIdade = ((double)cont /n) *100;
		
		double somaAltura = 0.0;
		for(int i = 0; i < altura.length; i++) {
			somaAltura += altura[i];
		}
		double mediaAltura = somaAltura / n;
		
		System.out.println("A media de altura e: " + mediaAltura);
		System.out.println("A porcentagem de pessoas menores que 16 anos e: " + mediaIdade);
		
		sc.close();
	}

}
