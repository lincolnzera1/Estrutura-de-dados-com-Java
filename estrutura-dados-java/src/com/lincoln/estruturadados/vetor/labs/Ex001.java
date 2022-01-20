package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.vetor.Lista;

public class Ex001 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(2);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		lista.adicionar("F");
		
		System.out.println(lista.contem("s"));
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}

}
