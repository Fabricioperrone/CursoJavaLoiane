package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		int opcao;

		boolean sair = false;
		while (!sair) {

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair...");

			opcao = scan.nextInt();

			if (opcao == 1) {// adiocionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				dia--;
				System.out.println("Digite o compromisso");
			    Scanner entradaTeclado = new Scanner(System.in);
				compromissos[dia][hora] = entradaTeclado.nextLine();

			} else if (opcao == 2) {// verifica compromisso
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso.");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente");
			}
		}
	}
}