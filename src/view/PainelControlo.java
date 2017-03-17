package view;

import controller.GerirAnimais;
import controller.GerirClientes;
import controller.GerirConsultas;
import controller.GerirVacinas;
import model.Animal;
import model.Cliente;
import model.Consultas;
import model.Vacinas;

public class PainelControlo {
	
	InserirClientes insCli;
	GerirClientes gerCli;
	InserirAnimais insAni;
	GerirAnimais gerAni;
	InserirConsultas insCon;
	GerirConsultas gerCon;
	InserirVacinas insVac;
	GerirVacinas gerVac;

	public PainelControlo(){
		
		//Artigos
		insCli = new InserirClientes();
		gerCli = new GerirClientes();		
		Cliente c = insCli.criarCliente();
		gerCli.addCliente(c);	
		
		
		//Categorias
		insAni = new InserirAnimais();
		gerAni = new GerirAnimais();
		Animal a = insAni.criarAnimal();
		gerAni.addAnimal(a);
		
		//Instituicoes
		insCon = new InserirConsultas();
		gerCon = new GerirConsultas();
		Consultas con = insCon.criarConsultas();
		gerCon.addConsultas(con);
		
		//Instituicoes
		insVac = new InserirVacinas();
		gerVac = new GerirVacinas();
		Vacinas vac = insVac.criarVacinas();
		gerVac.addVacinas(vac);
		
}
	
	
}
