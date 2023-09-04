package projeto4.calculoArea;

public class Circulo extends Forma{
	
	protected double raio;
	
	Circulo(){
	}
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio ;
	}
	
}
