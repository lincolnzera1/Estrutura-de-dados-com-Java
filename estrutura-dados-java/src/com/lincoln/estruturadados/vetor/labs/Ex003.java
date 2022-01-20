package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.vetor.Lista;

public class Ex003 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(2);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		
		lista.remover2("C");
		System.out.println(lista.toString());

	}

}
