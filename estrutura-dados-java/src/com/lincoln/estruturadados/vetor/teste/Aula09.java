package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adicionar("teste001");
		vetor.adicionar("teste002");
		vetor.adicionar("teste003");
		vetor.adicionar("teste004");
		vetor.adicionar("teste005");
		vetor.adicionar("teste006");
		vetor.adicionar("teste007");
		vetor.adicionar("teste008");
		
		System.out.println(vetor.toString());
		System.out.println(vetor.remover(1));
		System.out.println(vetor.toString());
		System.out.println(vetor.tamanho());
		

	}

}
