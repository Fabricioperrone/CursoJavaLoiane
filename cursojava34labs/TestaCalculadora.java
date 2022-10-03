package com.loiane.cursojava34labs;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.somar(1, 2));
		imprimirTela(Calculadora.subtrair(2, 1));
		imprimirTela(Calculadora.multiplicar(1, 2));
		imprimirTela(Calculadora.dividir(4, 2));
		imprimirTela(Calculadora.potencia(2, 4));
	}
	
	static void  imprimirTela(int num) {
		System.out.println(num);
	}
}
