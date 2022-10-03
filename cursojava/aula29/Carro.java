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

	// metodo simples: sem retorno e/ou par�metro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km");
	}

	// m�todo com retorno
	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	// M�todo com par�metro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}
}
