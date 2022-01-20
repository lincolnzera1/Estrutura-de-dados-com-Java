package com.lincoln.estruturadados.vetor.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {

		Queue<Integer> filaPrioridade = new PriorityQueue<Integer>();

		filaPrioridade.add(2);
		filaPrioridade.add(1);
		filaPrioridade.add(3);
		filaPrioridade.add(4);
		filaPrioridade.add(5);
		filaPrioridade.add(4);

		
		System.out.println(filaPrioridade);
	}

}
