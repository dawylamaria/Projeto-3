package br.edu.fescfafic.biblioteca.Model;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Pessoa {
    public UUID id;

    public DadosPessoais dadosPessoais;

    public LocalDate cadastradoEm;

    public static Contato contato;

    public Endereco endereco;

    public Pessoa(LocalDate cadastradoEm, Contato contato, Endereco endereco, DadosPessoais dadosPessoais) {
        this.id = UUID.randomUUID();
        this.dadosPessoais = dadosPessoais;
        this.cadastradoEm = cadastradoEm;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Pessoa(LocalDate cadastradoEm, UUID id, Contato contato, Endereco endereco) {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getCadastradoEm() {
        return cadastradoEm;
    }

    public void setCadastradoEm(LocalDate cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
    }

    public static Contato getContato() {
        return contato;
    }

    public static void setContato(Contato contato) {
        Pessoa.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", dadosPessoais=" + dadosPessoais +
                ", cadastradoEm=" + cadastradoEm +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
