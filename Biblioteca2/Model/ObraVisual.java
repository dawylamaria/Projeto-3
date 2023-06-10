package br.edu.fescfafic.biblioteca.Model;

import br.edu.fescfafic.biblioteca.Interface.IAdicionarAoAcervo;

public class ObraVisual extends Acervo implements IAdicionarAoAcervo{
    public boolean exposto;

    public ObraVisual(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, boolean exposto){
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.exposto = exposto;
    }

    public void setDisponivel(boolean status){
        this.disponivel = status;
    }

    public boolean getDisponivel(){
        return this.disponivel;

    }

    public void setExposto(boolean status){
        this.exposto = status;
    }

    public void getExposto(){
        System.out.println(this.exposto);
    }

    public void adicionarAoAcervo(Acervo Visual){
        this.listaAcervoGeral.add(Visual);
    }
}
