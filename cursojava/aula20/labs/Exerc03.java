package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Enre com valor da posição[" + i + "," + j + "]");
				numeros[i][j] = scan.nextInt();
			}
		}

		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("PARES = " + qtdPares);
		System.out.println("IMPARES = " + qtdImpares);

	}
}
