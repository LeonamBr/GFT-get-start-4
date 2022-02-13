package config;

import java.time.Instant;

import entities.Bank;
import entities.Client;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class InitConfig {
	
	public static Bank bank = new Bank("DIOBank");

	private Client client;
	
	public void init() {
		
		client = new Client("John Bacon", Instant.parse("2004-12-25T00:00:00Z"), 18, new ContaCorrente(2000.00));
		bank.addClient(client);
		client = new Client("Steve Lazy", Instant.parse("2000-06-24T00:00:00Z"), 24, new ContaPoupanca(1500.00));
		bank.addClient(client);
		client = new Client("Mary xmas", Instant.parse("1998-07-12T00:00:00Z"), 26, new ContaCorrente(5000.00));
		bank.addClient(client);
		client = new Client("Michelle O'Granja", Instant.parse("1995-01-07T00:00:00Z"), 29, new ContaPoupanca(10000.00));
		bank.addClient(client);
		
	}
	
	

}
