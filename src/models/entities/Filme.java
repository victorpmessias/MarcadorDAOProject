package models.entities;

import java.util.Date;
import java.util.Objects;

public class Filme extends Conteudo{
	private Autor escritor;
	private Autor diretor;
	private String duracao;
	
	
	public Filme() {
		super();
	}


	public Filme(Long id, String nome, Date dataDeLancamento, String genero,Autor escritor, Autor diretor, 
			String duracao) {
		super(id, nome, dataDeLancamento, genero);	
		this.escritor = escritor;
		this.diretor = diretor;
		this.duracao = duracao;
	}


	public Autor getEscritor() {
		return escritor;
	}


	public void setEscritor(Autor escritor) {
		this.escritor = escritor;
	}


	public Autor getDiretor() {
		return diretor;
	}


	public void setDiretor(Autor diretor) {
		this.diretor = diretor;
	}


	public String getDuracao() {
		return duracao;
	}


	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diretor, duracao, escritor);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return Objects.equals(diretor, other.diretor) && Objects.equals(duracao, other.duracao)
				&& Objects.equals(escritor, other.escritor);
	}





	
	
	
}
