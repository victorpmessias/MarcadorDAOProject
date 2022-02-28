package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.UsuarioDao;
import models.entities.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao{
	Connection conn;
	
	public UsuarioDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Usuario obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO usuarios "
					+ "(NomeDeUsuario, Nome, DataDeInscricao, DataDeNascimento, Email, Senha) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?)",
						Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getUsername());
			st.setString(2, obj.getNome());
			st.setDate(3, new java.sql.Date(obj.getDataDeInscricao().getTime()));
			st.setDate(4, new java.sql.Date(obj.getDataDeNascimento().getTime()));
			st.setString(5, obj.getEmail());
			st.setString(6, obj.getSenha());
		
			int linhasAfetadas = st.executeUpdate();
			
			if(linhasAfetadas > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexcpected error! No rows affected");
			}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void atualizar(Usuario obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE usuarios "
					+"SET NomeDeUsuario = ?, Nome = ?,DataDeInscricao = ?, DataDeNascimento = ?, Email = ?, Senha = ? "
					+"WHERE Id = ?");
			st.setString(1, obj.getUsername());
			st.setString(2, obj.getNome());
			st.setDate(3, new java.sql.Date(obj.getDataDeInscricao().getTime()));
			st.setDate(4, new java.sql.Date(obj.getDataDeNascimento().getTime()));
			st.setString(5, obj.getEmail());
			st.setString(6, obj.getSenha());
			st.setInt(7, obj.getId());
		
			int linhasAfetadas = st.executeUpdate();
			if(linhasAfetadas == 0) {
				throw new DbException("Erro inesperado! : Nenhuma linha afetada.");
				}

		
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void deletarPorId(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"DELETE FROM usuarios "
					+"WHERE Id = ?"
					);
			
			st.setInt(1, id);			
			
			int linhasAfetadas = st.executeUpdate();
			if(linhasAfetadas == 0) {
				throw new DbException("Erro inesperado! : Nenhuma linha afetada.");
				}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Usuario procurarPorId(Integer id) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * FROM usuarios "
					+ "WHERE Id = ?"
					);
			
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return instanciarUsuario(rs);
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Usuario procuraPorUserNome(String nome) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * FROM usuarios "
					+ "WHERE NomeDeUsuario = ?"
					);
			
			st.setString(1, nome);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return instanciarUsuario(rs);
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(st);
		}
	}

	@Override
	public List<Usuario> procurarTodos() {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * FROM usuarios "
					);
			
			ResultSet rs = st.executeQuery();
			List<Usuario> lista = new ArrayList<>();
			
			while(rs.next()) {
				Usuario usuario =  instanciarUsuario(rs);
				lista.add(usuario);
			}
			return lista;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(st);
		}
	}
	
	private Usuario instanciarUsuario(ResultSet rs) throws SQLException {
		return new Usuario(rs.getInt("Id"),rs.getString("Nome"), rs.getString("NomeDeUsuario"), 
				rs.getDate("DataDeInscricao"), rs.getDate("DataDeNascimento"), rs.getNString("Email"));
	}

}
