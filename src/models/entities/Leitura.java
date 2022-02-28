package models.entities;

import java.util.Objects;

public class Leitura extends Conteudo{
	private Autor escritor;
	private Integer paginas;
	public Leitura() {
	}
	public Leitura(Autor escritor, Integer paginas) {
		this.escritor = escritor;
		this.paginas = paginas;
	}
	public Autor getEscritor() {
		return escritor;
	}
	public void setEscritor(Autor escritor) {
		this.escritor = escritor;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(escritor, paginas);
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
		Leitura other = (Leitura) obj;
		return Objects.equals(escritor, other.escritor) && Objects.equals(paginas, other.paginas);
	}
	
	
}
