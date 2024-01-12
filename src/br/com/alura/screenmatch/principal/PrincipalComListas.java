package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville" ,2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item:listaDeAssistidos) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        Collections.sort((buscaPorArtista));
        System.out.println("Ordem: " + buscaPorArtista);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        /*System.out.println("\nUsando for: ");
        for (int i = 0; i < listaDeAssistidos.size() ; i++) {
            System.out.println("Filme: " + listaDeAssistidos.get(i).getNome()
                    + " ("+listaDeAssistidos.get(i).getAnoDeLancamento()+")");
        }*/
    }
}
