package br.com.bytebank.banco.models;

public class SaldoInsuficienteException extends Exception{ //checked
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
