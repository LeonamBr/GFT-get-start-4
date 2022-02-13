package entities;

import enums.ContaType;
import interfacies.IConta;

public class ContaCorrente extends Conta implements IConta{

	private Integer id;
	
	private Double saldo;
	
	private ContaType type = ContaType.CORRENTE;
	
	public ContaCorrente() {
	}
		
	public ContaCorrente(Double saldo) {
		this.id = Conta.newId();
		this.saldo = saldo;
	}
	
	public Integer getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
	}

	public ContaType getType() {
		return type;
	}

	@Override
	public void depositar(Double value) {
		saldo += value;		
	}

	@Override
	public void transferir(Double value, Conta contaSaida, Conta contaDestino) {
		contaSaida.sacar(value);
		contaDestino.depositar(value);
	}

	@Override
	public void sacar(Double value) {
		saldo -= value;		
	}

}
