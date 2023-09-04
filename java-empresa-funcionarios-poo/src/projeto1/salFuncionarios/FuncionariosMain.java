package projeto1.salFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Funcionarios> lista = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionários: ");
		int quantidade = scan.nextInt();
		
		for(int i = 1 ; i <= quantidade; i++) {
			System.out.println("Funcionário # " + i + "data:");
			System.out.print("Terceirizado (y/n?)");
			char ch = scan.next().charAt(0);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Horas: ");
			int horas = scan.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = scan.nextDouble();
			if(ch == 'y') {
				System.out.print("Pagamento Adicinal: ");
				double cobrancaAdicional = scan.nextDouble();
				Funcionarios func = new FuncionariosTerceirizados(nome, horas, valorPorHora, cobrancaAdicional);
				lista.add(func);
			}
			else {
				Funcionarios func = new Funcionarios(nome, horas, valorPorHora);
				lista.add(func);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos");
		for(Funcionarios func : lista) {
			System.out.println(func.getNome() + " -R$" + String.format("%.2f", func.pagamento()));
			
		}
		
		
		scan.close();
		
		
	}

}
