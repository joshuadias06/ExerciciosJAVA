package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		int[] vect=  new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o valor da posicao" + i);
			vect[i] =sc.nextInt();
		}
		System.out.println("Numeros Negativos:");
		for(int i = 0; i< vect.length; i++) {
			if(vect[i]< 0) {
				System.out.printf("%d\n",vect[i]);
			}
		}
		
		sc.close();
	}

}
