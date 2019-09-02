package br.com.bancopan.apicliente.controller;

import br.com.bancopan.apicliente.domain.Clientes;
import br.com.bancopan.apicliente.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    private ResponseEntity<List<Clientes>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(clientesRepository.findAll());
    }

    @GetMapping("/{CPF}")
    private ResponseEntity<Clientes>listarPorCpf(@PathVariable("CPF") String cpf ){
        return ResponseEntity.status(HttpStatus.OK).body(clientesRepository.findByCpf(cpf));
    }

    //https://viacep.com.br/ws/{cep}/json

}