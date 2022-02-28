package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.FilmeDao;
import models.entities.Autor;
import models.entities.Filme;

public class FilmeDaoJDBC implements FilmeDao{
	Connection conn;
	
	public FilmeDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Filme obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Filme obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Filme procurarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filme> procurarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filme> procurarPorGenero(String gen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filme> procurarPorAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}
}
