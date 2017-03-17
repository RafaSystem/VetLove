package model;

public class Cliente {

	private int idUtilizador;
	private String nome;
	private String morada;
	private String email;
	private int telefone;
	
	public int getIdUtilizador() {
		return idUtilizador;
	}
	public void setIdUtilizador(int idUtilizador) {
		this.idUtilizador = idUtilizador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Cliente(int idUtilizador, String nome, String morada, String email, int telefone) {
		super();
		this.idUtilizador = idUtilizador;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
	}
	
	
}
