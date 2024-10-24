package br.itb.projeto.CentroArtesMarciais.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Plano")
public class Plano extends EntidadeBase {

	private String nome;
	private String ano;
	private String descricao;
	private Float valorMensal;
	private Float valorSemestral;
	private Float valorAnual;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(Float valorMensal) {
		this.valorMensal = valorMensal;
	}

	public Float getValorSemestral() {
		return valorSemestral;
	}

	public void setValorSemestral(Float valorSemestral) {
		this.valorSemestral = valorSemestral;
	}

	public Float getValorAnual() {
		return valorAnual;
	}

	public void setValorAnual(Float valorAnual) {
		this.valorAnual = valorAnual;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
