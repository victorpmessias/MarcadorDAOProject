package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import models.enums.TipoAutor;


public class Autor {
	private String nome;
	private Date DataDeNascimento;
	private List<Conteudo> obras = new ArrayList<>();
	private TipoAutor tipo;
	
	
	
	public Autor(String nome, Date dataDeNascimento, TipoAutor tipo) {
		this.nome = nome;
		DataDeNascimento = dataDeNascimento;
		this.tipo = tipo;
	}
	public Autor() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}
	public List<Conteudo> getObras() {
		return obras;
	}
	public TipoAutor getTipo() {
		return tipo;
	}
	public void setTipo(TipoAutor tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DataDeNascimento, nome, obras, tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(DataDeNascimento, other.DataDeNascimento) && Objects.equals(nome, other.nome)
				&& Objects.equals(obras, other.obras) && tipo == other.tipo;
	}

	
}
