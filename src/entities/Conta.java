package entities;

import enums.ContaType;
import interfacies.IConta;

public abstract class Conta implements IConta{
		
	private static Integer id = 1;
	
	private Double saldo;
	
	private ContaType type;
	
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
	
	public ContaType getType() {
		return type;
	}

	
}
