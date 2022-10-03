package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		int contador = 0;
		
		while (popA <= popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			contador++;
		}
		System.out.println("População A:" + popA);
		System.out.println("Populaçã B:" + popB);
		System.out.println("Qtd anos: " + contador);

	}

}
