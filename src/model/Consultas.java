package model;

public class Consultas {

	private String dataConsulta;
	private String descConsulta;
	
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getDescConsulta() {
		return descConsulta;
	}
	public void setDescConsulta(String descConsulta) {
		this.descConsulta = descConsulta;
	}
	public Consultas(String dataConsulta, String descConsulta) {
		super();
		this.dataConsulta = dataConsulta;
		this.descConsulta = descConsulta;
	}
	
}
