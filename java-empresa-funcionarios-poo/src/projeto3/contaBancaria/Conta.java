package projeto3.contaBancaria;

public abstract class Conta {
	
	protected Integer numero;
	protected String titular;
	protected double saldo;
	
	Conta(){
	}

	public Conta(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double conta) {
		saldo += conta;
	}
	
	public void sacar(Double conta) {
		saldo -= conta;
	}
	

}
