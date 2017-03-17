package controller;

import java.util.ArrayList;
import model.Vacinas;

public class GerirVacinas {
	ArrayList<Vacinas> arVacinas;
	
	public GerirVacinas(){
		arVacinas = new ArrayList<Vacinas>();
	}
	
	public void addVacinas(Vacinas vac){
		arVacinas.add(vac);
	}
	
}
