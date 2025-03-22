package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Endereco;

import java.util.List;

public record BibliotecaResponse(Long id, String nome, Endereco endereco, List<LivroResponse> livros) {
}
