package com.lincoln.estruturadados.vetor.labs;

import java.util.Stack;

import com.lincoln.estruturadados.vetor.Livros;

public class Ex014 extends Livros{

	public static void main(String[] args) {

		Stack<Livros> pilha1 = new Stack<Livros>();
		Stack<Livros> pilha2 = new Stack<Livros>();
		Livros livro1 = new Livros();
		Livros livro2 = new Livros();
		
		livro1.setAno(2);
		livro1.setAutor("2");
		livro1.setIsbn("2");
		
		livro2.setAno(3);
		livro2.setAutor("3");
		livro2.setIsbn("3");
		
		pilha1.add(livro1);
		pilha2.add(livro2);
		
		System.out.println(pilha1);
		System.out.println(pilha2);
	}

}
