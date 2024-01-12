package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulos){
        this.tempoTotal += titulos.getDuracaoEmMinutos();
    }

}
