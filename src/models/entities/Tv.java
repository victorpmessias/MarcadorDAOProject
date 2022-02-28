package models.entities;

import java.util.Objects;

public class Tv extends Conteudo{
	private Autor escritor;
	private Autor diretor;
	private Integer episodios;
	private Integer temporadas;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diretor, episodios, escritor, temporadas);
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
		Tv other = (Tv) obj;
		return Objects.equals(diretor, other.diretor) && Objects.equals(episodios, other.episodios)
				&& Objects.equals(escritor, other.escritor) && Objects.equals(temporadas, other.temporadas);
	}
	public Tv(Autor escritor, Autor diretor, Integer episodios, Integer temporadas) {
		this.escritor = escritor;
		this.diretor = diretor;
		this.episodios = episodios;
		this.temporadas = temporadas;
	}
	public Tv() {
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
	public Integer getEpisodios() {
		return episodios;
	}
	public void setEpisodios(Integer episodios) {
		this.episodios = episodios;
	}
	public Integer getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}
	
	
}
