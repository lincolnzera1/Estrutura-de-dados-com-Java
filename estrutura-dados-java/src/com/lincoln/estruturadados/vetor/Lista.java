package com.lincoln.estruturadados.vetor;

import java.util.Arrays;

public class Lista<T> {
	
	private T[] elementos; // atributo do tipo strnig
	private int tamanho;
	//private int indice;

	public Lista(int capacidade) { // construtor
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
		//this.indice = 0;
	}
	
	public Lista() {
		this(10);
	}

	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {    //se o contador tamanho, for menor q o tamanho da lista...
			this.elementos[this.tamanho] = elemento; //adicione na posição do contador, o elemento q está sendo passado
			this.tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanho;
	}


	public T busca(int posicao) {
		
		if(!(posicao >=0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];

	}
	
	public int existe(T elemento) {
		for(int i=0; i<this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return 1;
			}
		}
		return -1;
	}
	
	public boolean inserir(int position, T elemento) { // Insere um elemento no vetor, em qualquer posição.
		//String estado = "";
		for(int i=1; i<=this.tamanho-position; i++) {
			//estado = this.elementos[this.tamanho-i]; //teste004 index 3...
			this.elementos[this.tamanho-i+1] = this.elementos[this.tamanho-i]; // teste004 index 4,e assim vai.
			this.aumentarCapacidade();
		}
		this.elementos[position] = elemento;
		return true;
	}
	
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T novoVetor[] = (T[]) new Object[this.elementos.length*2];
			for(int i=0; i<this.tamanho; i++) {
				novoVetor[i] = this.elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
	public T remover(int posicao) {
		for(int i=1; i<this.tamanho; i++) {															
			this.elementos[posicao+i-1] = this.elementos[posicao+i];  	// Pego o indice posterior ao que eu quero ...
																		// ... e coloco ele na posição que eu quero (ou seja, posição q escolhi retirar).
		}
		return this.elementos[this.tamanho-1];
	}
	
	public boolean contem(T elemento) {
		for(int i=0;i<this.tamanho-1; i++) {
			if(this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public T ultimoIndice() { // tipo T, pois se futuramente eu criar um array de outro tipo...
							  // um tipo String não iria suportar outro tipo, mas um tipo T sim.
		return this.elementos[this.tamanho - 1];
	}
	
	public void remover2(T elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i] == elemento) {
				remover(i);
			}
		}
		this.tamanho--; // diminui o tamanho pra não ficar um null aparecendo na lista.
	}
	
	public T obtem(int posicao) {
		return this.elementos[posicao];
	}
	
	public void limpar() {
		for(int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}


	@Override
	public String toString() {
		if(this.tamanho > 0) {
			String s = "[";
			for(int i=0; i<this.tamanho; i++) {
				s += this.elementos[i];
				if(i < this.tamanho-1) {
					s += " ,";
				}else if(i == this.tamanho - 1) {
					s += "]";
				}
			}
			return s;
		}else {
			return "[]";
		}
		//return Arrays.toString(elementos);
		
	}
}
