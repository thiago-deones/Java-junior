package org.example.dio.ordemArcoiris;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cores {
    public static void main(String[] args) {
        List<ArcoIris> listaBruta = List.of(
                new ArcoIris("Azul"),
                new ArcoIris("Vermelho"),
                new ArcoIris("Verde"),
                new ArcoIris("Lilas"),
                new ArcoIris("Rosa"),
                new ArcoIris("Roxo"),
                new ArcoIris("Amarelo")
        );

        // colocar as cores da forma como foi escrita
        for (ArcoIris arcoIris: listaBruta) System.out.println("cor " + arcoIris.getCor());
        //Colocar a quantidade de cores que tem
        System.out.println("Quantidade de cores que tem : " + listaBruta.size());
        //Colocar em ordem alfabetica
        Set<ArcoIris> listaOrdenada = new TreeSet<>(listaBruta);
        System.out.println("Lista ordenada: " + listaOrdenada);
        //Colocar em forma invertida da qual foi dada
        System.out.printf("Lista invertida: ");
        for (ArcoIris arcoIris : listaBruta.reversed()){
            System.out.printf(arcoIris.getCor() + " ");
        }
        //Com a letra v
        System.out.println("Cores que começam com a letra v");
        for (ArcoIris arcoIris: listaBruta){
            if (arcoIris.getCor().startsWith("V") || arcoIris.getCor().startsWith("v")) {
                System.out.println(arcoIris.getCor() + " ");
            }
        }
        //cria-se um arayList para ficar mais pratico a mudança
        List<ArcoIris> listMutalvel = new ArrayList<>(listaBruta);
        //pede a remoçao dos itens desejados
        listMutalvel.removeIf(arcoIris -> !arcoIris.getCor().toUpperCase().startsWith("V"));

        System.out.println(listMutalvel);
        //limpar a lista
        listMutalvel.clear();

        System.out.println(listMutalvel);
    }
}
