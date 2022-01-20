package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adicionar("teste001");
		vetor.adicionar("teste002");
		vetor.adicionar("teste003");
		vetor.adicionar("teste004");
		vetor.adicionar("teste001");
		vetor.adicionar("teste002");
		vetor.adicionar("teste003");
		vetor.adicionar("teste004");
		vetor.adicionar("teste001");
		vetor.adicionar("teste002");
		vetor.adicionar("teste003");
		vetor.adicionar("teste004");
		
		
		vetor.inserir(5, "projeto arpanet");
		System.out.println(vetor.toString());
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		
		

	}

}
