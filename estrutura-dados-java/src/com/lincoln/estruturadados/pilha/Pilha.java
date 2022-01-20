package com.lincoln.estruturadados.pilha;

import com.lincoln.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		this.aumentarCapacidade();
		super.adicionar(elemento);
	}
	
	public T topo() {
		if(this.estaVazia())
			return null;
		return this.elementos[this.tamanho-1];
	}
	
	public T desempilha() {
		if(this.estaVazia())
			return null;
		
		T elemento = this.elementos[this.tamanho-1];
		//this.elementos[this.tamanho-1] = null;
		this.tamanho--;
		return elemento;
	}
	
}
