package projeto3.contaBancaria;

public class Poupanca extends Conta{
	
	private double taxaDeJuros;
	
	Poupanca(){
	}

	public Poupanca(Integer numero, String titular, double saldo, double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override
	
	public void sacar(Double conta) {
		saldo -= conta; 
	}
	

}
