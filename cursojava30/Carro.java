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
		System.out.println("Chamando o construtor com 3 par�metros");
	}
 // Chamando construtor acima
	public Carro(String marca, String modelo) {
		this(marca , modelo, 10);
		System.out.println("Chamando o construtor com 2 par�metros");
		
		
	}

	// metodo simples: sem retorno e/ou par�metro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}

	// m�todo com retorno
	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}

	// M�todo com par�metro
	double calcularCombustivel(double km) {
 
		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;
	}
	// This - Referencia atributos e m�todos da pr�pria classe.
}
