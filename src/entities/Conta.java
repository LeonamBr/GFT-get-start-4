package entities;

import interfacies.IConta;

public abstract class Conta implements IConta{
	
	private Integer id;
	
	public Conta() {
	}

	public Conta(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
