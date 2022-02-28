package model.dao;

import java.util.List;

import models.entities.Usuario;

public interface UsuarioDao {
	void inserir(Usuario obj);
	void atualizar(Usuario obj);
	void deletarPorId(Integer id);
	Usuario procurarPorId(Integer id);
	Usuario procuraPorUserNome(String nome);
	List<Usuario> procurarTodos();
}
