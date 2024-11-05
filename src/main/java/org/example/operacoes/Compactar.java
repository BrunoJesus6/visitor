package org.example.operacoes;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;

public class Compactar implements Visitor {

    public String visitarPDF(PDF pdf) {
        return "Compactando o PDF: " + pdf.getConteudo();
    }

    public String visitarWord(Word word) {
        return "Compactando o documento Word: " + word.getConteudo();
    }

    public String visitarExcel(Excel excel) {
        return "Compactando o documento Excel: " + excel.getConteudo();
    }
}
