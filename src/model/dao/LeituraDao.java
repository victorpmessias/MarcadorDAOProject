package model.dao;

import java.util.List;

import models.entities.Autor;
import models.entities.Leitura;

public interface LeituraDao {
	void inserir(Leitura obj);
	void atualizar(Leitura obj);
	void deletarPorId(Integer id);
	Leitura procurarPorId(Integer id);
	List<Leitura> procurarTodos();
	List<Leitura> procurarPorGenero(String gen);
	List<Leitura> procurarPorAutor(Autor autor);
}
