package com.lincoln.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.lincoln.estruturadados.vetor.Contato;
import com.lincoln.estruturadados.vetor.Lista;

public class Ex007 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		Lista<Contato> vetor = new Lista<Contato>(0);
		
		criarContatos(20, vetor);
		
		
	}
	
	private static void criarContatos(int quantidade, Lista<Contato> vetor) {
		Contato contato;
		for(int i=0; i<quantidade;i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNumero(i+"000-0000");
			contato.setEmail(i+"@norway.train");
			
			vetor.adicionar(contato);
		}
	}
}
