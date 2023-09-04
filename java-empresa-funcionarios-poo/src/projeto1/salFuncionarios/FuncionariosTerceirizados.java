package projeto1.salFuncionarios;
public class FuncionariosTerceirizados extends Funcionarios {
	
	protected double cobrancaAdicional;
	
	public FuncionariosTerceirizados() {
	}
	
	public FuncionariosTerceirizados(String nome, int horas, double valorPorHora, double cobrancaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	public double getCobrançaAdicional() {
		return cobrancaAdicional;
	}
	
	public void setCobrançaAdicional(double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}

	@Override
	public double pagamento() {
		return horas * valorPorHora + cobrancaAdicional * 1.1;
		//return super.pagamento + cobrancaAdicional * 1.1;		
	}
	
	

}
