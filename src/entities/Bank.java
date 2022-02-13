package entities;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String name;
	
	private List<Client> client = new ArrayList<>();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY").withZone(ZoneId.of("UTC"));
	
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
		out += "\n\nConta: " + cliente.getConta().getId() + "\tTipo: " + cliente.getType().toString()
			+ "\nCliente: " + cliente.getName()
			+ "\nAniversario: " + formatter.format(cliente.getBirthDate())
			+ "\nAge: " + cliente.getAge()
			+ "\nSaldo: " + cliente.getConta().getSaldo();
		}
		return out;
	}
	
	
}
