package view;

import java.util.Scanner;

import model.Animal;

public class InserirAnimais {

public InserirAnimais(){
		
	}
	
	private Scanner scanner;
	
	public Animal criarAnimal(){
		scanner = new Scanner(System.in);
		
		System.out.println("Insira a classificacao do animal: ");
		String classificacao = scanner.nextLine();
		
		System.out.println("Insira a raca do animal");
		String raca = scanner.nextLine();
		
		System.out.println("Insira a dataNascimento do animal");
		String data = scanner.nextLine();
		
		
		
		Animal a = new Animal(classificacao, raca, data);
		a.setClassificacao(classificacao);
		a.setRaca(raca);
		a.setDataNascimento(data);
		
		return a;
	}
	
}
