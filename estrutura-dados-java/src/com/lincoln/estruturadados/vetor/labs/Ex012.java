package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.pilha.Pilha;

public class Ex012 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		
		for(int i = 0; i<=1000; i++) {
			if((i%2)==0) {
				par.empilha(i);
			}else {
				impar.empilha(i);
			}
			if(i==0 && (!(par.estaVazia()) && !(impar.estaVazia()))) {
				par.desempilha();
				impar.desempilha();
			}else {
				System.out.println("Erro! Tem uma ou mais pilhas vazias.");
			}

		}
		for(int i = 0; i<par.tamanho()-1; i++) {
			System.out.println("Elemento "+par.topo()+" retirado!");
			par.desempilha();
		}
		
		for(int i = 0; i<impar.tamanho()-1; i++) {
			System.out.println("Elemento "+impar.topo()+" retirado!");
			impar.desempilha();
		}
		

	}

}
