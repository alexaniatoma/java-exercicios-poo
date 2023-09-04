package projeto2.produtosDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int quantidade = scan.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Produto #" + i + "data: ");
			System.out.println("Comum ou Importado (c/i)?");
			char ch = scan.next().charAt(0);
			System.out.print("Nome: ");
			String nome = scan.next();
			System.out.print("Preço: ");
			double preco = scan.nextDouble();
			
			
			
			if(ch == 'c') {
				Produto prod = new Produto(nome, preco);
				lista.add(prod);
			}
			else {
				System.out.println("Taxa Importação: ");
				double taxaAlfandega = scan.nextDouble();
				Produto prod = new ProdutoImportado(nome, preco, taxaAlfandega);
				lista.add(prod);
			}
			
			
		}
		
		System.out.println();
		System.out.println("Etiquetas de Preço");
		for(Produto prod : lista) {
			System.out.println(prod.precoEtiqueta());
		}
		
		scan.close();
	}

}
