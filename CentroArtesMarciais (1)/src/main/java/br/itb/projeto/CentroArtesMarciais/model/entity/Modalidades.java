package br.itb.projeto.CentroArtesMarciais.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Modalidades extends EntidadeBase { 
	
	private String nome;
	private String dificuldade;
	private String descricao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
