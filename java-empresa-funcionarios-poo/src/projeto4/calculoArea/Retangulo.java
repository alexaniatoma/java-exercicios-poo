package projeto4.calculoArea;

public class Retangulo extends Forma {
	protected double largura;
	protected double altura;
	
	Retangulo(){
	}
	
	public Retangulo(Cor cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}
