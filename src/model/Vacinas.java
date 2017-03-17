package model;

public class Vacinas {

	private String dataVacina;
	private String nomeVacina;
	private int preco;
	
	public String getDataVacina() {
		return dataVacina;
	}
	public void setDataVacina(String dataVacina) {
		this.dataVacina = dataVacina;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Vacinas(String dataVacina, String nomeVacina, int preco) {
		super();
		this.dataVacina = dataVacina;
		this.nomeVacina = nomeVacina;
		this.preco = preco;
	}
	
}
