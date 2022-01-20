package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.pilha.Pilha;

public class Ex015 {

	public static void main(String[] args) {

		Pilha<String> pilha = new Pilha<String>();
		
		pilha.empilha("tenet");
		pilha.empilha("roma");
		
		System.out.println(pilha);
		
		String s = "";
		for(int i=0; i<pilha.tamanho()-1; i++) {
		}
	}

}
