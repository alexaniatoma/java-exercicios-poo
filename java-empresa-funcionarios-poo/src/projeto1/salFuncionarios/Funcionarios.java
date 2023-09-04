package projeto1.salFuncionarios;

public class Funcionarios {
	
	protected String nome;
	protected int horas;
	protected double valorPorHora;
	
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, int horas, double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double pagamento() {
		return horas * valorPorHora;
				
	}

}
