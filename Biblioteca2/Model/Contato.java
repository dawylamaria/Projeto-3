package br.edu.fescfafic.biblioteca.Model;

public class Contato{

    public String numeroTelefone;
    public String email;

    public Contato(String numeroTelefone, String email) {
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "numeroTelefone='" + numeroTelefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
