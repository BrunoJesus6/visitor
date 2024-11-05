package org.example.operacoes;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;

public class Imprimir implements Visitor {

    public String visitarPDF(PDF pdf) {
        return "Imprimindo conteúdo do PDF: " + pdf.getConteudo();
    }

    public String visitarWord(Word word) {
        return "Imprimindo conteúdo do Word: " + word.getConteudo();
    }

    public String visitarExcel(Excel excel) {
        return "Imprimindo conteúdo do Excel: " + excel.getConteudo();
    }
}