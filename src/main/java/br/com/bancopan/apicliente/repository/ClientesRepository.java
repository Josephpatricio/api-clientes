package br.com.bancopan.apicliente.repository;

import br.com.bancopan.apicliente.domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    Clientes findByCpf(String cpf);
}