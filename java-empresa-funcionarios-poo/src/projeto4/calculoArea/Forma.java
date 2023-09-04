package projeto4.calculoArea;

public abstract class Forma {
	
	private Cor cor;
	
	Forma() {
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract double area();
	

}
