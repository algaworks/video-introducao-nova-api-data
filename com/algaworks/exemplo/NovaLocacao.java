package com.algaworks.exemplo;

import java.util.Arrays;
import java.util.List;

import com.algaworks.model.Cliente;
import com.algaworks.model.Filme;
import com.algaworks.model.Locacao;
import com.algaworks.repository.Filmes;

public class NovaLocacao {

	public static void main(String[] args) {
		Filmes filmes = new Filmes();
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0), filmes.porCodigo(2));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente("João Souza"));
		
		locacao.imprimirRecibo();
	}
	
}
