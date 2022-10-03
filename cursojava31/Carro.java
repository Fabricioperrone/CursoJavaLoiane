package com.loiane.cursojava31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	// metodo simples: sem retorno e/ou par�metro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	// m�todo com retorno
	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	private double divideKMPorCombustivel(double km) {
		return  km / this.consumoCombustivel;
	}
	// M�todo com par�metro
	double calcularCombustivel(double km) {

		//double qtdCombustivel = km / this.consumoCombustivel;

		return this.divideKMPorCombustivel(km);
	}
	// This - Referencia atributos e m�todos da pr�pria classe.
}
