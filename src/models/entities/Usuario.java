package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Usuario {
	private int id;
	private String nome;
	private String username;
	private Date dataDeInscricao;
	private Date dataDeNascimento;
	private String email;
	private String senha;
	private List<Conteudo> conteudoLista = new ArrayList<>();
	
	public Usuario() {
	}
	public Usuario(int id, String nome, String username, Date dataDeInscricao, Date dataDeNascimento,String email) {
		this.nome = nome;
		this.username = username;
		this.dataDeInscricao = dataDeInscricao;
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
		this.id = id;

	}

	public Usuario(String nome, String username, Date dataDeInscricao, Date dataDeNascimento,String email, String senha) {
		this.nome = nome;
		this.username = username;
		this.dataDeInscricao = dataDeInscricao;
		this.dataDeNascimento = dataDeNascimento;
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataDeInscricao() {
		return dataDeInscricao;
	}
	
	public void setDataDeInscricao(Date dataDeInscricao) {
		this.dataDeInscricao = dataDeInscricao;
	}
	public List<Conteudo> getConteudoLista() {
		return conteudoLista;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoLista, dataDeInscricao, dataDeNascimento, email, id, nome, senha, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(conteudoLista, other.conteudoLista)
				&& Objects.equals(dataDeInscricao, other.dataDeInscricao)
				&& Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Usuario [id= " + id + ", nome=" + nome + ", username=" + username + ", dataDeInscricao=" + dataDeInscricao
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
	}
	
	
	
}
