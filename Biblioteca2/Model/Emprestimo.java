package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    public LocalDate dataSaida;
    public LocalDate dataEntrada;
    final double VALOR_MULTA = 0.50;
    public Leitor nome;
    public ArrayList<Impresso> obrasEmPosse = new ArrayList<>();

    public Emprestimo(LocalDate dataSaida, LocalDate dataEntrada, Leitor nome) {
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nome = nome;
    }

    public void adicionarObra(Impresso impresso) {
        this.obrasEmPosse.add(impresso);
    }

    private void removerObra(Impresso impresso) {
        this.obrasEmPosse.remove(impresso);
    }


    public double devolucao(Impresso impresso) {

        double multa = 0;

        long diasEmprestados = ChronoUnit.DAYS.between(this.dataSaida, this.dataEntrada);

        if (diasEmprestados > 7) {
            multa = (diasEmprestados - 7)* this.VALOR_MULTA;
        }

        this.removerObra(impresso);

        return multa;
    }

}
