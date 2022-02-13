package entities;

import interfacies.IConta;

public abstract class Conta implements IConta{
		
	private static Integer id = 1;
	
	private Double saldo;
	
	public Conta() {
	}

	public Integer getId() {
		return id;
	}
	
	public static Integer newId() {
		return id++;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
