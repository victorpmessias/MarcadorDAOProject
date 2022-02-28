package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.TvDao;
import models.entities.Autor;
import models.entities.Tv;

public class TvDaoJDBC implements TvDao{
	Connection conn;
	
	public TvDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Tv obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Tv obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tv procurarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tv> procurarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tv> procurarPorGenero(String gen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tv> procurarPorAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}

}
