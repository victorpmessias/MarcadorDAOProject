package model.dao;

import java.util.List;

import models.entities.Autor;
import models.entities.Tv;

public interface TvDao {
	void inserir(Tv obj);
	void atualizar(Tv obj);
	void deletarPorId(Integer id);
	Tv procurarPorId(Integer id);
	List<Tv> procurarTodos();
	List<Tv> procurarPorGenero(String gen);
	List<Tv> procurarPorAutor(Autor autor);
}
