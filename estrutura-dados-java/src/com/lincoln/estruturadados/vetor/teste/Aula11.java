package com.lincoln.estruturadados.vetor.teste;

import com.lincoln.estruturadados.vetor.Contato;
import com.lincoln.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		Lista<Contato> vetor2 = new Lista<Contato>(1);
		
		Contato c1 = new Contato("flow","1234-5678","aquilanolasco@gmail.com");
		
		//vetor2.adicionar(c1);
		
		System.out.println(vetor2);

	}

}
