package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;
import br.edu.fescfafic.biblioteca.Interface.*;
public class Impresso extends Acervo implements IAdicionarAoAcervo {

    public String edicao;
    public String genero;
    public String nomeDaObra;
    public String quantidadeDePaginas;

    public Impresso(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, String edicao,
                    String genero, String nomeDaObra, String quantidadeDePaginas) {
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.edicao = edicao;
        this.genero = genero;
        this.nomeDaObra = nomeDaObra;
        this.quantidadeDePaginas = quantidadeDePaginas;

    }
    public void adicionarAoAcervo(Acervo impresso){
        this.listaAcervoGeral.add(impresso);
    }

}
