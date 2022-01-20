package com.lincoln.estruturadados.fila;

import com.lincoln.estruturadados.base.EstruturaEstatica;

public class FilaComPrioridade<T> extends Fila<T>{
	
	public void enfileirar(T elemento) {
		
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for(i=0; i<this.tamanho(); i++) {
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		this.inserir(i, elemento);
	}
}
