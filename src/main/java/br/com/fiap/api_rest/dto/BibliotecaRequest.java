package br.com.fiap.api_rest.dto;

import jakarta.validation.constraints.NotBlank;

public record BibliotecaRequest(
        @NotBlank(message = "O nome da biblioteca é obrigatório") String nome) {
}
