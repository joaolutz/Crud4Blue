package br.com.joaolutz.crud4blue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Endereco")
public class Endereco {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="LOGRADOURO")
	private String logradouro;
	@Column(name="NUMERO")
	private Integer numero;
	@Column(name="CEP")
	private String cep;
	@Column(name="MUNICIPIO")
	private String municipio;
	@Column(name="UF")
	private String uf;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

}
