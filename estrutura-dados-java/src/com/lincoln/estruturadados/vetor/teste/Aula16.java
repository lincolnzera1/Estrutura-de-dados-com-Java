package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		System.out.println(pilha.topo());
		
		pilha.empilha(5);
		pilha.empilha(3);
		
		System.out.println(pilha.topo());

	}

}
