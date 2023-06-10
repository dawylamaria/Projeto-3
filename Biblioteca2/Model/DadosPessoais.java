package br.edu.fescfafic.biblioteca.Model;

import java.time.LocalDate;

public class DadosPessoais{
    public String nome;

    public LocalDate dataNascimento;

    public String sexo;

    public String apelido;

    protected String _RG;

    protected String _CPF;

    public DadosPessoais(String nome, LocalDate dataNascimento, String sexo, String apelido, String _RG, String _CPF) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.apelido = apelido;
        this._RG = _RG;
        this._CPF = _CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String get_RG() {
        return _RG;
    }

    public void set_RG(String _RG) {
        this._RG = _RG;
    }

    public String get_CPF() {
        return _CPF;
    }

    public void set_CPF(String _CPF) {
        this._CPF = _CPF;
    }

    @Override
    public String toString() {
        return "DadosPessoais{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo='" + sexo + '\'' +
                ", apelido='" + apelido + '\'' +
                ", _RG='" + _RG + '\'' +
                ", _CPF='" + _CPF + '\'' +
                '}';
    }
}
