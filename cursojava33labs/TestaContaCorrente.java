package com.loiane.cursojava33labs;

public class TestaContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("123");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);

		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}
		System.out.println("Depósito de 500 reais");
		conta.consultarSaldo();

		if (conta.verificaUsoDoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificaUsoDoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}
	}
}
