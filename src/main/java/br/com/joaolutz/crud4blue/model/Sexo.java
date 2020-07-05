package br.com.joaolutz.crud4blue.model;

public enum Sexo {

	MASCULINO("M"),
	FEMININO("F"),
	INDEFINIDO("I");
	
	private String value;
	
	Sexo(String value) {
		this.value = value;
	}
	
}
