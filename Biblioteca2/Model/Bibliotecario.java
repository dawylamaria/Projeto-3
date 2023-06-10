package br.edu.fescfafic.biblioteca.Model;

import java.time.LocalDate;

public class Bibliotecario extends Pessoa {
    public String crb;

    public Bibliotecario(LocalDate cadastradoEm, Contato contato, Endereco endereco, DadosPessoais dadosPessoais, String crb) {
        super(cadastradoEm, contato, endereco, dadosPessoais);
        this.crb = crb;
    }

    public void getCrb(){
        System.out.println(this.crb);
    }
    public void setCrb(String crb){
        this.crb = crb;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "crb='" + crb + '\'' +
                ", id=" + id +
                ", dadosPessoais=" + dadosPessoais +
                ", cadastradoEm=" + cadastradoEm +
                ", endereco=" + endereco +
                '}';
    }
}
