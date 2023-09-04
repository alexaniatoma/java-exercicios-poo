package projeto2.produtosDados;

public class ProdutoImportado extends Produto{
	
	protected double taxaAlfandega;
	
	ProdutoImportado(){
	}

	public ProdutoImportado(String nome, Double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String precoEtiqueta() {
		return getNome()
			 + String.format(" R$%.2f", preco + taxaAlfandega); 
	}

}
