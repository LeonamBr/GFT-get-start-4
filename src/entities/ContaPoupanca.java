package entities;

import java.util.Objects;

import interfacies.IConta;

public class ContaPoupanca extends Conta implements IConta{

	private Integer id;
	
	private Double saldo;
	
	public ContaPoupanca() {
	}
		
	public ContaPoupanca(Integer id) {
		super();
		this.id = Conta.newId();
	}

	public Integer getId() {
		return id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		return Objects.equals(id, other.id);
	}

}
