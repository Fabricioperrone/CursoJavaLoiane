package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] jogoVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = 0");
		
		int jogada = 1;
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			
			if(jogada % 2 == 1) {//jogador 1
				
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3");
				sinal = 0;
			}
			boolean linhaValida =  false;
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if ( linha >= 2 && linha <=3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >=1 && coluna <=3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			//verifica posição válida
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == '0') {
				System.out.println("Posição já usada, tente novamente");
			} else {
				for (int i=0; i<jogoVelha.length;i++) {
					for (int j=0; j<jogoVelha.length;j++)
					System.out.println(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			//verifica ganhador
			if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][]))
		}

	}

}
