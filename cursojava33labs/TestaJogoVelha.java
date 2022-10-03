package com.loiane.cursojava33labs;

import java.util.Scanner;

public class TestaJogoVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		jogoDaVelha jogoDaVelha = new jogoDaVelha();

		System.out.println("Jogador 1 = x");
		System.out.println("Jogador 2 = 0");

		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {

			if (jogoDaVelha.vezJogador1()) {
				System.out.println("Vez jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'x';
			} else {

				System.out.println("Vez jogador 2. Escolha linha e coluna (1-3).");
				sinal = '0';
			}

			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);

			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente");
			}

			jogoDaVelha.imprimirTabuleiro();

			if (jogoDaVelha.verificarGanhador('x')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if (jogoDaVelha.verificarGanhador('0')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogoDaVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida.");
			}

		}
	}
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		valor--;
		return valor;
	}
}
