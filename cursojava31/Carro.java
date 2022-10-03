package com.loiane.cursojava31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	// metodo simples: sem retorno e/ou parâmetro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	// método com retorno
	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	private double divideKMPorCombustivel(double km) {
		return  km / this.consumoCombustivel;
	}
	// Método com parâmetro
	double calcularCombustivel(double km) {

		//double qtdCombustivel = km / this.consumoCombustivel;

		return this.divideKMPorCombustivel(km);
	}
	// This - Referencia atributos e métodos da própria classe.
}
