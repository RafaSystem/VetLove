package view;

import java.util.Scanner;

import model.Vacinas;

public class InserirVacinas {
	
public InserirVacinas(){
		
	}
	
	private Scanner scanner;
	
	public Vacinas criarVacinas(){
		scanner = new Scanner(System.in);
		
		System.out.println("Insira a data da vacina: ");
		String data = scanner.nextLine();
		
		System.out.println("Insira o nome da vacina");
		String nome = scanner.nextLine();
		
		System.out.println("Insira o preco da vacina: ");
		int preco = scanner.nextInt();
		
		
		
		Vacinas vac = new Vacinas(data,nome,preco);
		vac.setDataVacina(data);
		vac.setNomeVacina(nome);
		vac.setPreco(preco);
		
		return vac;
	}
	
	
}
