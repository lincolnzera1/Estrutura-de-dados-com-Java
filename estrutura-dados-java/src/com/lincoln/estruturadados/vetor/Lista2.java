package com.lincoln.estruturadados.vetor;

import com.lincoln.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	
	public Lista2() {
		super();
	}

	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	
	
	/*public boolean adicionar(T elemento) {
		return super.adicionar(elemento);
	}*/
	public boolean inserir(int position, T elemento) {
		return super.inserir(position, elemento);
	}
}
