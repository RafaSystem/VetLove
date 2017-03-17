package controller;

import java.util.ArrayList;
import model.Animal;

public class GerirAnimais {
		ArrayList<Animal> arAnimal;
		
	public GerirAnimais(){
		arAnimal = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal ani){
		arAnimal.add(ani);
	}
	
}
