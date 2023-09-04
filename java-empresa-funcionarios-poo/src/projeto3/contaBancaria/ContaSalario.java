package projeto3.contaBancaria;

public class ContaSalario extends Conta{
	
	private double limiteDeEmprestimo;
	
	public ContaSalario() {
		
	}

	public ContaSalario(Integer numero, String titular, double saldo, double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void limite(Double conta) {
		if(conta <= limiteDeEmprestimo) {
			saldo += conta - 10;
		}
	}
	
	@Override
	public void sacar(Double conta) {
		super.sacar(conta);
		saldo -=  2.0;
	}

}


