package model.dao;

import java.util.List;

import models.entities.Autor;
import models.entities.Filme;

public interface FilmeDao {
	void inserir(Filme obj);
	void atualizar(Filme obj);
	void deletarPorId(Integer id);
	Filme procurarPorId(Integer id);
	List<Filme> procurarTodos();
	List<Filme> procurarPorGenero(String gen);
	List<Filme> procurarPorAutor(Autor autor);
}
