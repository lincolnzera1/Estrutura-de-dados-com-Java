package com.lincoln.estruturadados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos; // atributo do tipo T
	protected int tamanho;

	public EstruturaEstatica(int capacidade) { // construtor
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	public void adicionar(T elemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {    //se o contador tamanho, for menor q o tamanho da lista...
			this.elementos[this.tamanho] = elemento; //adicione na posi��o do contador, o elemento q est� sendo passado
			this.tamanho++;
		}
	}
	
	public boolean inserir(int position, T elemento) { // Insere um elemento no vetor, em qualquer posi��o.
		//String estado = "";
		for(int i=1; i<=this.tamanho-position; i++) {
			//estado = this.elementos[this.tamanho-i]; //teste004 index 3...
			this.elementos[this.tamanho-i+1] = this.elementos[this.tamanho-i]; // teste004 index 4,e assim vai.
			this.aumentarCapacidade();
		}
		this.elementos[position] = elemento;
		return true;
	}
	
	protected void aumentarCapacidade() {
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
		if(this.tamanho == 0)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		if(this.tamanho > 0) {
			String s = "[";
			for(int i=0; i<this.tamanho; i++) {
				s += this.elementos[i];
				if(i < this.tamanho-1) {
					s += ", ";
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
