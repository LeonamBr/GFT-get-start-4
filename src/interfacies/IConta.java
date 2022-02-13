package interfacies;

import entities.Conta;

public interface IConta {
	
	void depositar(Double value);
	
	void transferir(Double value, Conta contaSaida  ,Conta contaDestino);
	
	void sacar(Double value);

}
