package com.algaworks.wine.model;

public enum TipoVinho {

	TINTO("Tinto"), BRANCO("Branco"), ROSE("Rosé");

	private String descricao;

	private TipoVinho(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
