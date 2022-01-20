package com.lincoln.estruturadados.fila;

import java.util.Arrays;

import com.lincoln.estruturadados.base.EstruturaEstatica;

public class Fila<T>{

	protected T[] elementos;
	private int tamanho;
	
	public Fila() {
		this(10);
	}
	
	public Fila(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		int tamanho = 0;
	}
	
	public void enfileirar(T elemento) {
		this.aumentaCapacidade();
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}
	
	public T desenfileira() {
		T excluido = this.elementos[0];
		
		for(int i=1; i<this.tamanho; i++) {
			this.elementos[i-1] = this.elementos[i];
		}
		this.tamanho--;
		return excluido;
	}
	
	public boolean inserir(int position, T elemento) { 
		for(int i=1; i<=this.tamanho-position; i++) {
			this.elementos[this.tamanho-i+1] = this.elementos[this.tamanho-i]; 
			this.aumentaCapacidade();
		}
		this.elementos[position] = elemento;
		return true;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T novoVetor[] = (T[]) new Object[this.elementos.length*2];
			for(int i=0; i<this.tamanho; i++) {
				novoVetor[i] = this.elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia() {
		if(this.tamanho == 0) {
			return true;
		}
		return false;
	}
	
	public T espiar() {
		return this.elementos[0];
	}

	public String toString() {
		
		String s = "[";
		if(this.tamanho > 0) {
			for(int i = 0; i<this.tamanho; i++) {
				if(i < this.tamanho-1)
					s += this.elementos[i] + ", ";
				else
					s += this.elementos[i] + "]";
			}
		}else {
			return "[]";
		}
		return s;
	}
	
	
	
	
}
