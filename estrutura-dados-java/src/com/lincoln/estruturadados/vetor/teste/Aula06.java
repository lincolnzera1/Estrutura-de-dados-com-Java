package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adicionar("teste001");
		vetor.adicionar("teste002");
		vetor.adicionar("teste003");
		vetor.adicionar("teste004");

		System.out.println(vetor.existe("teste003"));
	}

}
