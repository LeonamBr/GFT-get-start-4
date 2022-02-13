package entities;

import java.util.Objects;

import enums.ContaType;
import interfacies.IConta;

public class ContaPoupanca extends Conta implements IConta{

	private Integer id;
	
	private Double saldo;
	
	private ContaType type = ContaType.POUPANCA;
	
	public ContaPoupanca() {
	}
		
	public ContaPoupanca(double saldo) {
		this.id = Conta.newId();
		this.saldo = saldo;
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
