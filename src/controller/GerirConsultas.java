package controller;

import java.util.ArrayList;
import model.Consultas;

public class GerirConsultas {
		ArrayList<Consultas> arConsultas;
		
	public GerirConsultas(){
		arConsultas = new ArrayList<Consultas>();
	}
	
	public void addConsultas(Consultas con){
		arConsultas.add(con);
	}
	
}
