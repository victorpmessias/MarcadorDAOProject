package application;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import models.entities.Usuario;

public class Program {
	public static void main(String[] args) throws SQLException {
		Usuario user = new Usuario();
		UsuarioDao userDao = DaoFactory.criarUsuarioDao();
		
		user.setDataDeNascimento(new Date());
		user.setNome("carlos2 henrique pedia");
		user.setEmail("victdasodasr@email.com");
		user.setSenha("123456");
		user.setUsername("pedrdasinho");
		user.setDataDeInscricao(new Date());
		
//		userDao.inserir(user);
		System.out.println("Novo Id adicionado: " + user.getId());
		
		
		user.setNome("Carlos Calros");
		user.setId(1);
//		userDao.atualizar(user);
		

		System.out.println("Id alterado: " + user.getId());
		
		Usuario newUser = userDao.procurarPorId(1);
		System.out.println(newUser);
		
		System.out.println();
		
		Usuario findUser = userDao.procuraPorUserNome("vitinho");
		System.out.println(findUser);
		
		System.out.println();
		
		List<Usuario> lista = userDao.procurarTodos();
		lista.stream().forEach(c -> System.out.println(c));
	}
}
