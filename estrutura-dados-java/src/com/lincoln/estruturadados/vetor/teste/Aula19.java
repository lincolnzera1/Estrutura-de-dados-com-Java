package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>(5);

		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		fila.enfileirar(5);

		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		System.out.println(fila.espiar());
	}

}
