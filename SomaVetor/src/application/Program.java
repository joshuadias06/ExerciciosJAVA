package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[]vect = new double[n];
		
		for(int i= 0; i < vect.length; i++) {
			System.out.println("Digite o valor da posicao: " +  i);
			vect[i]=sc.nextDouble();
		}
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		System.out.println("O valor da soma e: " + soma);
		System.out.println("O valor da media e: " + media);
		
		sc.close();
	}

}
