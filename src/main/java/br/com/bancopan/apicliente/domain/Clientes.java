package br.com.bancopan.apicliente.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CLIENTES")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "O nome não pode estar em branco.")
    private String nome;

    @NotEmpty(message = "O CPF não pode estar em branco.")
    @CPF(message = "CPF Invalido.")
    private String cpf;

    @NotEmpty(message = "O CEP não pode estar em branco.")
    @Size(min = 8, max = 9)
    private String cep;

    @NotEmpty(message = "Endenreço não pode estar em branco")
    @Size(min = 5, max = 50)
    private String endereco;

    @Size(min = 2, max = 15)
    private String estado;

    @Size(min = 2, max = 15)
    private String municipio;
}