package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.pilha.Pilha;

public class Aula017 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		int numero = 25;
		for(int i=numero; i>=1; i /= 2) {
			 System.out.println(i);
			 pilha.empilha(i%2);
			 System.out.println(pilha);
		}
		String s = "";
		System.out.println("Tamanho a seguir:");
		for(int i = 0; i<pilha.tamanho()-1; i++) {
			System.out.println(pilha);
			s += pilha.desempilha() + ", ";
			System.out.println(s);
		}
	}

}
