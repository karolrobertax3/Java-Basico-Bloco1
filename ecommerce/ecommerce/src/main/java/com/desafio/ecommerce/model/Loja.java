package com.desafio.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_loja")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLoja;
	
	@NotNull
	private String nomeLoja;
	
	private String descricao;
	
	@OneToMany(mappedBy = "loja", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("loja")
	private List<Produto> produto;

	public Loja() {
		super();
		
	}

	public Loja(Long idLoja, @NotNull String nomeLoja, String descricao) {
		super();
		this.idLoja = idLoja;
		this.nomeLoja = nomeLoja;
		this.descricao = descricao;
	}

	public Long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Long idLoja) {
		this.idLoja = idLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
