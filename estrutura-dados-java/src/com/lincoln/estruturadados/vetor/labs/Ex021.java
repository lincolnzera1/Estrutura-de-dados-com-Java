package com.lincoln.estruturadados.vetor.labs;

import com.lincoln.estruturadados.fila.Fila;
import com.lincoln.estruturadados.vetor.teste.Documento;

public class Ex021 {

	public static void main(String[] args) {

		Fila<Documento> fila = new Fila<>();
		
		fila.enfileirar(new Documento("jhon", 1));
		fila.enfileirar(new Documento("Aquila", 2));
		fila.enfileirar(new Documento("nolasco", 15));
		
		System.out.println(fila);
		
		for(int i=0; i< 10; i++) {
			
		}
	}

}
