package jdbc.test;

import java.util.Calendar;

import jdbc.dao.ContatoDao;
import modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Joana");
		contato.setEmail("JColibri");
		contato.setEndereco("R Teste de Banco 3185");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}	
}
