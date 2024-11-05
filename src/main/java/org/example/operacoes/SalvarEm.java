package org.example.operacoes;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;

public class SalvarEm implements Visitor {

    public String visitarPDF(PDF pdf) {
        return "O documento já está em PDF.";
    }

    public String visitarWord(Word word) {
        return "Salvando documento Word como PDF: " + word.getConteudo();
    }

    public String visitarExcel(Excel excel) {
        return "Salvando documento Excel como PDF: " + excel.getConteudo();
    }
}
