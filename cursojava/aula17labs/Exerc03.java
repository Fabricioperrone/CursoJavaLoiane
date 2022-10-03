package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, estadoCivil;
		int idade;
		double salario;
		String sexo;

		do {

			System.out.println("Entre com o nome:");

			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no mínimo 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;
		do {

			System.out.println("Entre com a idade:");

			idade = scan.nextInt();

			if (idade > 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser maior que 0 e 150.");
			}
		} while (!infoValida);
		infoValida = false;
		do {

			System.out.println("Entre com o salário:");

			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que zero.");
			}
		} while (!infoValida);

		infoValida = false;
		// genero
		do {

			System.out.println("Entre com o sexo:");

			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo pecisa ser 'f' ou 'm'");
			}
		} while (!infoValida);
		// estado civil
		do {
			infoValida = false;
			System.out.println("Entre com o estado civil:");

			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c','v', ou 'd'.");
			}
		} while (!infoValida);
			scan.close();
		// fim
		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);

	}
}
