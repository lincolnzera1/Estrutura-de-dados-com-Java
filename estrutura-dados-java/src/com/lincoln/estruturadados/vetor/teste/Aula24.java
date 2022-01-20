package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.fila.Fila;
import com.lincoln.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileirar(new Paciente("A", 3));
		fila.enfileirar(new Paciente("B", 2));
		fila.enfileirar(new Paciente("C", 4));
		fila.enfileirar(new Paciente("D", 1));
		
		fila.inserir(1, new Paciente("A", 3));

		System.out.println(fila);
	}

}
