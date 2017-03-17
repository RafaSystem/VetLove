package controller;

import java.util.ArrayList;
import model.Cliente;

	public class GerirClientes {
		ArrayList<Cliente> arCliente;
		
	public GerirClientes(){
		arCliente = new ArrayList<Cliente>();
	}
	
	public void addCliente(Cliente cli){
		arCliente.add(cli);
	}
	
}