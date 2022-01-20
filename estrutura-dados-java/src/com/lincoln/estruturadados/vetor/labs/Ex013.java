package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.pilha.Pilha;
import com.lincoln.estruturadados.vetor.Livros;

public class Ex013 extends Livros{

	public static void main(String[] args) {

		Pilha<Livros> pilha = new Pilha<Livros>(20);
		Livros l1 = new Livros("1",2,"3");
		Livros l2 = new Livros("4",4,"4");
		Livros l3 = new Livros("7",7,"7");
		Livros l4 = new Livros("11",11,"11");
		Livros l5 = new Livros("14",14,"14");
		Livros l6 = new Livros("17",17,"17");
		
		pilha.empilha(l1);
		pilha.empilha(l2);
		pilha.empilha(l3);
		pilha.empilha(l4);
		pilha.empilha(l5);
		pilha.empilha(l6);
		
		System.out.println(pilha);
	}

}
