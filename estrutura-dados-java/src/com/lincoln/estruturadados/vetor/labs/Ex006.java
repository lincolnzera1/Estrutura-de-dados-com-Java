package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.vetor.Contato;
import com.lincoln.estruturadados.vetor.Lista;

public class Ex006 {

	public static void main(String[] args) {
		
		Lista<Contato> lista = new Lista<Contato>(20);
		
		criarContatos(20, lista);
		System.out.println(lista);

		
	}
	
	
	private static void criarContatos(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for(int i=0; i<quantidade;i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNumero(i+"000-0000");
			contato.setEmail(i+"@norway.train");
			
			lista.adicionar(contato);
			
		}
	}
	
}



