package model.dao;

import db.DB;
import model.dao.impl.FilmeDaoJDBC;
import model.dao.impl.LeituraDaoJDBC;
import model.dao.impl.TvDaoJDBC;
import model.dao.impl.UsuarioDaoJDBC;

public class DaoFactory {
	
	public static UsuarioDao criarUsuarioDao(){
		return new UsuarioDaoJDBC(DB.getConnection());
	}
	
	public static FilmeDao criarFilmeDao(){
		return new FilmeDaoJDBC(DB.getConnection());
	}
	
	public static LeituraDao criarLeituraDao() {
		return new LeituraDaoJDBC(DB.getConnection());
	}
	public static TvDao criarTvDao() {
		return new TvDaoJDBC(DB.getConnection());
	}

}
