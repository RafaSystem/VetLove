package view;

import java.util.Scanner;
import model.Cliente;

public class InserirClientes {
	
	public InserirClientes(){
		
	}
	
	public int i=0;
	private Scanner scanner;
	
	public Cliente criarCliente(){
		scanner = new Scanner(System.in);
		
		int idUtilizador = i+1;
		
		System.out.println("Insira o nome do Cliente: ");
		
		String nome = scanner.nextLine();
		
		System.out.println("Insira a morada do Cliente");
		String morada = scanner.nextLine();
		
		System.out.println("Insira o email do Cliente");
		String email = scanner.nextLine();
		
		System.out.println("Insira o numero de telefone do Cliente: ");
		int telefone = scanner.nextInt();
		
		
		Cliente c = new Cliente(idUtilizador, nome, morada, email, telefone);
		c.setIdUtilizador(idUtilizador);
		c.setNome(nome);
		c.setMorada(morada);
		c.setEmail(email);
		c.setTelefone(telefone);
		return c;
	}

}
