package projeto4.calculoArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AplicacaoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("Entre com o numéro de formas: ");
		int quantidade = scan.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Forma #" + i + " dados: " );
		System.out.print("Retangulo ou Circulo (r / c)? ");
		char chr = scan.next().charAt(0);
		
		System.out.print("Cor (PRETO/ AZUL/ VERMELHO: ");
		Cor cor = Cor.valueOf(scan.next());
		if(chr == 'r') {
			System.out.print("Altura: ");
			double altura = scan.nextDouble();
			System.out.print("Largura: ");
			double largura = scan.nextDouble();
			lista.add(new Retangulo(cor, largura, altura));
			
		}
		else {
			System.out.print("Raio: ");
			double raio = scan.nextDouble();
			lista.add(new Circulo(cor, raio));
		}
		
	}
		System.out.println();
		System.out.println("Areas das Formas");
		for(Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		scan.close();

	}

}
