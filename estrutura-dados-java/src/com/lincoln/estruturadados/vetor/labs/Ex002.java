package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.vetor.Lista;

public class Ex002 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(2);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		lista.adicionar("F");
		lista.adicionar("G");
		lista.adicionar("H");
		lista.adicionar("I");
		lista.adicionar("J");
		lista.adicionar("K");
		lista.adicionar("L");
		
		System.out.println(lista.contem("s"));
		System.out.println(lista);
		System.out.println(lista.tamanho());
		System.out.println(lista.ultimoIndice());

	}

}
