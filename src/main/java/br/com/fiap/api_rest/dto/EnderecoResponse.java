package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Biblioteca;

import java.util.List;

public record EnderecoResponse(Long id, String localizacao, Biblioteca biblioteca) {
}
