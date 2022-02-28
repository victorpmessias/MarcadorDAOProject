package models.entities;

import java.util.Date;
import java.util.Objects;

public abstract class Conteudo {
	private Long id;
	private String nome;
	private Date DataDeLancamento;
	private String genero;
	
	public Conteudo() {
	}

	public Conteudo(Long id, String nome, Date dataDeLancamento, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.DataDeLancamento = dataDeLancamento;
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DataDeLancamento, genero, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(DataDeLancamento, other.DataDeLancamento) && Objects.equals(genero, other.genero)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeLancamento() {
		return DataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		DataDeLancamento = dataDeLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	 
	
	
}
