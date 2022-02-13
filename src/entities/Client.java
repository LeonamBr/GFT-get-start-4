package entities;

import java.time.Instant;

import enums.ContaType;

public class Client {
	
	private String name;
	
	private Instant birthDate;
	
	private Integer age;
	
	private Conta conta;
	
	public Client() {
	}

	public Client(String name, Instant birthDate, Integer age, Conta conta) {
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
		this.conta = conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}
	
	public ContaType getType() {
		return getConta().getType();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Conta getConta() {
		return conta;
	}	

}
