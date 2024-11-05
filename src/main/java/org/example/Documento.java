package org.example;

import org.example.operacoes.Visitor;

public interface Documento {
    String aceitar(Visitor visitor);
}
