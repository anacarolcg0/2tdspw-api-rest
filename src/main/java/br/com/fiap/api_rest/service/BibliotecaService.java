package br.com.fiap.api_rest.service;

import br.com.fiap.api_rest.dto.AutorRequest;
import br.com.fiap.api_rest.dto.AutorResponse;
import br.com.fiap.api_rest.dto.BibliotecaRequest;
import br.com.fiap.api_rest.dto.BibliotecaResponse;
import br.com.fiap.api_rest.model.Autor;
import br.com.fiap.api_rest.model.Biblioteca;
import br.com.fiap.api_rest.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {
    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public Biblioteca requestToBiblioteca(BibliotecaRequest bibliotecaRequest) {
        return new Biblioteca(bibliotecaRequest.nome());
    }

    public BibliotecaResponse bibliotecaToResponse(Biblioteca biblioteca){
        return new BibliotecaResponse(
                biblioteca.getId(),
                biblioteca.getNome(),
                biblioteca.getEndereco(),
                livroService.livrosToResponse(biblioteca.getLivros()));
    }
}
