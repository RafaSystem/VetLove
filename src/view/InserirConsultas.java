package view;

import java.util.Scanner;

import model.Consultas;

public class InserirConsultas {
	
public InserirConsultas(){
		
	}
	
	private Scanner scanner;
	
	public Consultas criarConsultas(){
		scanner = new Scanner(System.in);
		
		System.out.println("Insira a data da consulta: ");
		String data = scanner.nextLine();
		
		System.out.println("Insira a descricao da consulta: ");
		String desc = scanner.nextLine();
		
		
		Consultas con = new Consultas(data, desc);
		con.setDataConsulta(data);
		con.setDescConsulta(desc);
		
		return con;
	}
	
	
}
