package com.daniel;

public class Cuenta {
	
	private String persona;
	private double saldo;
	
	public Cuenta(String persona, double saldo) {
		super();
		this.persona = persona;
		this.saldo = saldo;
	}
	
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
