package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.LeituraDao;
import models.entities.Autor;
import models.entities.Leitura;

public class LeituraDaoJDBC implements LeituraDao{
	Connection conn;
	
	public LeituraDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Leitura obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Leitura obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Leitura procurarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leitura> procurarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leitura> procurarPorGenero(String gen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leitura> procurarPorAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}
}
