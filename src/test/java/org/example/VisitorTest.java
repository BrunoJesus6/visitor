package org.example;

import org.example.tipos.Excel;
import org.example.tipos.PDF;
import org.example.tipos.Word;
import org.example.operacoes.Compactar;
import org.example.operacoes.Imprimir;
import org.example.operacoes.SalvarEm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    void deveImprimirPDF() {
        PDF pdf = new PDF("Conteúdo do PDF");

        Imprimir visitor = new Imprimir();
        assertEquals("Imprimindo conteúdo do PDF: Conteúdo do PDF", pdf.aceitar(visitor));
    }

    @Test
    void deveImprimirWord() {
        Word word = new Word("Conteúdo do Word");

        Imprimir visitor = new Imprimir();
        assertEquals("Imprimindo conteúdo do Word: Conteúdo do Word", word.aceitar(visitor));
    }

    @Test
    void deveImprimirExcel() {
        Excel excel = new Excel("Conteúdo do Excel");

        Imprimir visitor = new Imprimir();
        assertEquals("Imprimindo conteúdo do Excel: Conteúdo do Excel", excel.aceitar(visitor));
    }

    @Test
    void deveSalvarWordEmPDF() {
        Word word = new Word("Conteúdo do Word");

        SalvarEm visitor = new SalvarEm();
        assertEquals("Salvando documento Word como PDF: Conteúdo do Word", word.aceitar(visitor));
    }

    @Test
    void deveCompactarPDF() {
        PDF pdf = new PDF("Conteúdo do PDF");

        Compactar visitor = new Compactar();
        assertEquals("Compactando o PDF: Conteúdo do PDF", pdf.aceitar(visitor));
    }
}