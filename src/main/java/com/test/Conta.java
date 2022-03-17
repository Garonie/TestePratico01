package com.test;

public class Conta {
	private int saldo;
	private int vl_recarga;

	public Conta(int saldo) {
		this.saldo = saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setRecarga(int vl_recarga) {
		this.vl_recarga = vl_recarga;
	}

	public int getRecarga() {
		return this.vl_recarga;
	}

	public int saldo(int saldo, int recarga) {
		return 0;
	}

	// construtor
	public Conta(int saldo, int vl_recarga) {
		this.saldo = saldo;
		this.vl_recarga = vl_recarga;
	}

	// Faz a recarga caso tenha saldo em conta

	/*public boolean EfetuarRecarga(double vl_recarga) {
		if (vl_recarga < saldo) {
			this.saldo -= vl_recarga;
			return true;
		} else {
			return false;
		}

	}*/
}
