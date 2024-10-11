package com.coder.banco;

import com.coder.clase05.Persona;

public class Cuenta {
	private int numero;
	private double saldo;
	private Persona titular;
	
	
	public void abrirCuenta() {
		System.out.println("El saldo de la cuenta es:"+getSaldo());
	}	
	
	public void verSaldo() {
		System.out.println("El saldo de la cuenta es:"+getSaldo());
	}
	public void transferir() {
		System.out.println(titular.getNombre()+"hizo una transferencia");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	
	
	
}
