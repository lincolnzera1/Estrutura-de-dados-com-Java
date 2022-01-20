package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.pilha.Pilha;

public class Ex011 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i=0; i<=20; i = i+2) {
			if((i%2) == 0) {
				pilha.empilha(i);
			}else if(pilha.estaVazia()){
				System.out.println("A pilha está vazia!");
			}else {
				pilha.desempilha();
			}
			
			if(!(pilha.estaVazia())) {
				System.out.println("Elemento " + pilha.topo() + " Retirado!");
				pilha.desempilha();
				
			}
		}
		
		System.out.println("A pilha é: " + pilha);

	}

}
