package model;

public class Animal {

	private String classificacao;
	private String raca;
	private String dataNascimento;
	
	public Animal(String classificacao, String raca, String dataNascimento) {
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
