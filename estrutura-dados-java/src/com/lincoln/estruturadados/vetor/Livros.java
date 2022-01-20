package com.lincoln.estruturadados.vetor;

public class Livros {

	private String isbn;
	private int ano;
	private String autor;
	
	public Livros() {
		
	}
	
	public Livros(String isbn, int ano, String autor) {
		this.isbn = isbn;
		this.ano = ano;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]";
	}
	
	
}
