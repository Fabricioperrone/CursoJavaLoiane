package com.loiane.cursojava30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() { }	
	
	

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}
 // Chamando construtor acima
	public Carro(String marca, String modelo) {
		this(marca , modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
		
		
	}

	// metodo simples: sem retorno e/ou parâmetro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	// método com retorno
	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}

	// Método com parâmetro
	double calcularCombustivel(double km) {
 
		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;
	}
	// This - Referencia atributos e métodos da própria classe.
}
