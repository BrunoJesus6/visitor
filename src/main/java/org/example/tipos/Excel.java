package org.example.tipos;

import org.example.Documento;
import org.example.operacoes.Visitor;

public class Excel implements Documento {

    private String conteudo;

    public Excel(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarExcel(this);
    }
}