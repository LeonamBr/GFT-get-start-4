package application;

import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Scanner;

import config.InitConfig;
import entities.Bank;
import entities.Client;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import exceptions.BankException;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			InitConfig init = new InitConfig();
			init.init();
			
			Bank bank = InitConfig.bank;

			boolean isRunning = true;

			System.out.println("Bem vindo ao banco DIO!!");

			while (isRunning) {

				System.out.println("Escolha a opção desejada:");
				System.out.println("1 - Adicionar Conta corrente");
				System.out.println("2 - Adicionar conta poupança");
				System.out.println("3 - Listar contas");
				System.out.println("4 - sacar");
				System.out.println("5 - depositar");
				System.out.println("6 - Transferir");
				System.out.println("0 - Sair");

				int x = 0;

					try {
						x = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						throw new BankException("Caracter invalido");
					}

				switch (x) {

				case 1:
					System.out.print("Digite o nome do titular: ");
					String name = sc.nextLine();
					System.out.print("Entre com a data de aniversario(dd/mm/aaaa): ");
					String birthDate = sc.nextLine();
					String[] str = birthDate.split("/");
					String dia = str[0];
					String mes = str[1];
					String ano = str[2];
					System.out.print("Entre com a idade do titular: ");
					int idade = sc.nextInt();
					System.out.println("Entre com valor de deposito inicial: ");
					double valor = sc.nextDouble();
					Client cliente = new Client(name, Instant.parse("" + ano + "-" + mes + "-" + dia + "T00:00:00Z"),
							idade, new ContaCorrente(valor));
					bank.addClient(cliente);
					System.out.println("Numero da conta criado: " + (bank.getClient().indexOf(cliente) + 1));
					System.out.println();
					break;
				case 2:
					System.out.print("Digite o nome do titular: ");
					String name1 = sc.nextLine();
					System.out.print("Entre com a data de aniversario(dd/mm/aaaa): ");
					String birthDate1 = sc.nextLine();
					String[] str1 = birthDate1.split("/");
					String dia1 = str1[0];
					String mes1 = str1[1];
					String ano1 = str1[2];
					System.out.print("Entre com a idade do titular: ");
					int idade1 = sc.nextInt();
					System.out.println("Entre com valor de deposito inicial: ");
					double valor1 = sc.nextDouble();
					Client cliente1 = new Client(name1,
							Instant.parse("" + ano1 + "-" + mes1 + "-" + dia1 + "T00:00:00Z"), idade1,
							new ContaPoupanca(valor1));
					bank.addClient(cliente1);
					System.out.println("Numero da conta criado: " + (bank.getClient().indexOf(cliente1) + 1));
					System.out.println();
				case 3:
					System.out.println(bank);
					System.out.println();
					break;
				case 4:
					System.out.print("Digite o numero da conta: ");
					int conta = sc.nextInt();
					System.out.print("Digite o valor a ser sacado: ");
					double quantia = sc.nextDouble();
					bank.getClient().get(conta - 1).getConta().sacar(quantia);
					System.out.println("Novo saldo: " + bank.getClient().get(conta -1).getConta().getSaldo());
					break;
				case 5:
					System.out.print("Digite o numero da conta: ");
					int conta1 = sc.nextInt();
					System.out.print("Digite o valor a ser depositado: ");
					double quantia1 = sc.nextDouble();
					bank.getClient().get(conta1 - 1).getConta().depositar(quantia1);
					System.out.println("Novo saldo: " + bank.getClient().get(conta1 -1).getConta().getSaldo());
					break;
				case 6:
					System.out.print("Digite o numero da conta de saida dos fundos: ");
					int num = sc.nextInt();
					System.out.print("Digite o numero da conta de entrada dos fundos: ");
					int num2 = sc.nextInt();
					
					System.out.print("Digite a quantidade a ser transferida: ");
					double qnt = sc.nextDouble();
					bank.getClient().get(num - 1).getConta().sacar(qnt);
					bank.getClient().get(num2 - 1).getConta().depositar(qnt);
					
					System.out.println("Saldo da conta " + (num)+ ": " + bank.getClient().get(num -1).getConta().getSaldo());
					System.out.println("Saldo da conta " + (num2)+ ": " + bank.getClient().get(num2 -1).getConta().getSaldo());		
					break;
				case 0:
					isRunning = false;
					break;
				default:
					System.out.println("Opção invalida!!!");
					System.out.println();
				}
			}

		}

	}

}
