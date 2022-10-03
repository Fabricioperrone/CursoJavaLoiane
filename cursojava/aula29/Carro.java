package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	// Construtor
	Carro() {
		System.out.println("Classe carro foi instaciada");
		numPassageiros= 4;
	}
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	// metodo simples: sem retorno e/ou parâmetro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}

	// método com retorno
	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	// Método com parâmetro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}
}
