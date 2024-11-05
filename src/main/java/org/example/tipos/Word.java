package org.example.tipos;

import org.example.Documento;
import org.example.operacoes.Visitor;

public class Word implements Documento {

    private String conteudo;

    public Word(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarWord(this);
    }
}