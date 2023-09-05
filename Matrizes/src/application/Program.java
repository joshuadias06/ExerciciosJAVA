package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de colunas da matriz: ");
		int m = sc.nextInt();
		System.out.println("Digite o numero de linhas da matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println(matriz);
        }
		
		sc.close();
	}

}