package br.edu.fescfafic.biblioteca.Model;
import br.edu.fescfafic.biblioteca.Interface.IAdicionarAoAcervo;
import java.util.ArrayList;
public class Acervo implements IAdicionarAoAcervo{

    public String tipo;
    public String codigoIdentificador;
    public String autor;
    public String ano;
    public boolean disponivel;

    public ArrayList<Acervo> listaAcervoGeral = new ArrayList<>();

    public Acervo(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel){
        this.tipo = tipo;
        this.codigoIdentificador = codigoIdentificador;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }
    @Override
    public void adicionarAoAcervo(Acervo acervo){

    }

}
