package org.example.operacoes;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;

public interface Visitor {
    String visitarPDF(PDF pdf);
    String visitarWord(Word word);
    String visitarExcel(Excel excel);
}
