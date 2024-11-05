package org.example.operacoes;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;

public class SalvarEm implements Visitor {

    public String visitarPDF(PDF pdf) {
        return "Salvando arquivo em PDF: " + pdf.getConteudo();
    }

    public String visitarWord(Word word) {
        return "Salvando arquivo em Word: " + word.getConteudo();
    }

    public String visitarExcel(Excel excel) {
        return "Salvando arquivo em Excel: " + excel.getConteudo();
    }
}
