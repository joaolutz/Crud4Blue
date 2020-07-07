package br.com.joaolutz.crud4blue.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="NOME")
	private String nome;
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;
	@Enumerated(EnumType.STRING)
	@Column(name="SEXO")
	private Sexo sexo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ENDERECO")
	private Endereco endereco;
	@Transient
	private String idade;
	
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the idade
	 */
	public String getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(String idade) {
		this.idade = idade;
	}

}
