package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;
		do {

			System.out.println("Entre com o nome do usu�rio:");
			String nomeUsuario = scan.next();

			System.out.println("Entre com a senha:");
			String senha = scan.next();

			if (nomeUsuario.equalsIgnoreCase(senha)) {
				// infoValidas = false;
				System.out.println("Senha igual a usu�rio, digite novamente.");
				
			} else {
				infoValidas = true;
				System.out.println("Senha e usu�rios v�lidos.");
			}
		} while (!infoValidas);

	}
}
