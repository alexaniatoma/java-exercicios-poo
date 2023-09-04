package projeto3.contaBancaria;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoMain {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new Poupanca(1001, "Alex",500.00, 0.01));
		lista.add(new ContaSalario(1002, "Maria", 1000.0, 400));
		lista.add(new Poupanca(1003, "Bob", 300.0, 0.1));
		lista.add(new ContaSalario(1004, "Anna", 500.0, 500.0));
		
		double soma = 0.0;
		for(Conta conta : lista) {
			soma += conta.getSaldo();
		}
		
		System.out.printf("Total saldo: %.2f%n", soma);
		
		for(Conta conta : lista) {
			conta.depositar(10.0);
		}
		
		for(Conta conta : lista) {
			System.out.printf("Saldo atualizado para conta %d: %.2f%n", conta.getNumero(), conta.getSaldo());
		}
		
	}

}
