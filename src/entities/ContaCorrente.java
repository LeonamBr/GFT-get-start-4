package entities;

import interfacies.IConta;

public class ContaCorrente extends Conta implements IConta{

	private Integer id;
	
	private Double saldo;
	
	public ContaCorrente() {
	}
		
	public ContaCorrente(Double saldo) {
		super();
		this.id = Conta.newId();
		this.saldo = saldo;
	}
	
	public Integer getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
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
