package com.loiane.cursojava.aula29;

public class TesteCarro {
 
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("Volvo","Ducatto",10, 100,0.2 );
		
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);
	}
}
