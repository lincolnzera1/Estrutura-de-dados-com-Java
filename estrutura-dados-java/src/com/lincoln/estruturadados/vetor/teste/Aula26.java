package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.lista.ListaEncadeada;

public class Aula26 {

	public static void main(String[] args) {

		ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

		lista.adiciona(1);
		
		System.out.println(lista);
		System.out.println(lista.getTamanho());
	}

}
