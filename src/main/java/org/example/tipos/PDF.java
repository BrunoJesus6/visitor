package org.example.tipos;

import org.example.Documento;
import org.example.operacoes.Visitor;

public class PDF implements Documento {

    private String conteudo;

    public PDF(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarPDF(this);
    }
}
