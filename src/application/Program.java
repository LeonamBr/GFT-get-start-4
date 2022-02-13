package application;

import java.time.Instant;
import java.util.Scanner;

import entities.Bank;
import entities.Client;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank("DIOBank");
		
		while (true) {
			
		System.out.println("Bem vindo ao banco DIO!!");
		System.out.println("Escolha a opção desejada:");
		System.out.println("1 - Adicionar Conta");
		System.out.println("2 - Listar contas");
		System.out.println("3 - sacar");
		System.out.println("4 - depositar");
		System.out.println("5 - Transferir");
		Client cliente = new Client("Leonam Braga", Instant.parse("1989-12-01T20:15:16Z"), 32, new ContaCorrente(3500.00));
		
		Client cliente2 = new Client("Luan Braga", Instant.parse("1994-03-08T20:15:16Z"), 27, new ContaPoupanca(2000.00));
		
		bank.addClient(cliente);
		bank.addClient(cliente2);
		
		System.out.println(bank);
		
		}
	
		//sc.close();
		
	}

}
