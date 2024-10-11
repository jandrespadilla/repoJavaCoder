package com.coder.banco;

public class CuentaCorriente extends Cuenta {
	@Override
	public String toString() {
		return "Cuenta [numero=" + this.getNumero() + ", saldo=" + this.getSaldo() + ", titular=" + this.getTitular().toString() + "]";
	}
}
