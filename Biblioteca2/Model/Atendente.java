package br.edu.fescfafic.biblioteca.Model;

import java.time.LocalDate;

public class Atendente extends Pessoa {
    public Atendente(LocalDate cadastradoEm, Contato contato, Endereco endereco, DadosPessoais dadosPessoais) {
        super(cadastradoEm, contato, endereco, dadosPessoais);
    }
    @Override
    public String toString() {
        return "Atendente{" +
                "id=" + id +
                ", dadosPessoais=" + dadosPessoais +
                ", cadastradoEm=" + cadastradoEm +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }



}
