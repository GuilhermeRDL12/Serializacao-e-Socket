package br.com.fiap.entity;

import java.io.Serializable;

public class Vingador implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8015133131224696236L;

	private String nome;
	
	private String nomeRal;
	
	private String poder;
	
	
	public Vingador() {
		super();
	}

	public Vingador(String nome, String nomeRal, String poder) {
		super();
		this.nome = nome;
		this.nomeRal = nomeRal;
		this.poder = poder;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeRal() {
		return nomeRal;
	}

	public void setNomeRal(String nomeRal) {
		this.nomeRal = nomeRal;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

}
