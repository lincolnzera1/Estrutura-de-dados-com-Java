package com.lincoln.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos; // atributo do tipo strnig
	private String[] novoVetor;
	private int tamanho;
	private int indice;

	public Vetor(int capacidade) { // construtor
		this.elementos = new String[capacidade];
		this.tamanho = 0;
		this.indice = 0;
		//this.novoVetor = new String[0];
	}

	/*public void adicionar(String elemento) {
		for(int i = 0; i<this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break; // sai do loop, pois se n sair continua nele.
			}
		}
	}*/

	/*public void adicionar(String elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor cheio, impossível continuar");
		}
	}*/

	public boolean adicionar(String elemento) {
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


	public String busca(int posicao) {
		
		if(!(posicao >=0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];

	}
	
	public int existe(String elemento) {
		for(int i=0; i<this.tamanho;i++) {
			if(this.elementos[i].equals(elemento)) {
				return 1;
			}
		}
		return -1;
	}
	
	public boolean inserir(int position, String elemento) { // Insere um elemento no vetor, em qualquer posição.
		String estado = "";
		for(int i=1; i<=this.tamanho-position; i++) {
			estado = this.elementos[this.tamanho-i]; //teste004 index 3...
			this.elementos[this.tamanho-i+1] = estado; // teste004 index 4,e assim vai.
			this.aumentarCapacidade();
		}
		this.elementos[position] = elemento;
		return true;
	}
	
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String novoVetor[] = new String[this.elementos.length*2];
			for(int i=0; i<this.tamanho; i++) {
				novoVetor[i] = this.elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
	public String remover(int posicao) {
		for(int i=1; i<this.tamanho; i++) {															
			this.elementos[posicao+i-1] = this.elementos[posicao+i];  	// Pego o indice posterior ao que eu quero ...
																		// ... e coloco ele na posição que eu quero (ou seja, posição q escolhi retirar).
		}
		return this.elementos[this.tamanho-1];
	}


	@Override
	public String toString() {
		String s = "[";
		for(int i=0; i<this.tamanho; i++) {
			s += this.elementos[i];
			if(i < this.tamanho-1) {
				s += " ,";
			}else if(i == this.tamanho - 1) {
				s += "]";
			}
		}
		return Arrays.toString(elementos);
		//return s;
	}
}
