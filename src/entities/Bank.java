package entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String name;
	
	private List<Client> client = new ArrayList<>();
	
	public Bank() {
	}

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClient() {
		return client;
	}
	
	public void addClient(Client client) {
		this.client.add(client);
	}

	@Override
	public String toString() {
		String out = "";
		out += "Bank: " + name;
		for (Client cliente : this.client) {
		out += "Cliente: " + cliente.getName() 
			+ "\nAniversario: " + cliente.getBirthDate().toString()
			+ "\nAge: " + cliente.getAge() + "\n"
			+ "\nConta: " + cliente.getConta().getId();
		}
		return out;
	}
	
	
}
