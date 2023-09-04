package projeto2.produtosDados;

public class Produto {
	
	protected String nome;
	protected double preco;
	
	Produto() {
	}
	
	Produto(String nome, Double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String precoEtiqueta() {
		return getNome() + String.format(" R$%.2f ", preco);
	}

}
