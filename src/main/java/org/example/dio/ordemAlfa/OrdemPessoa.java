package org.example.dio.ordemAlfa;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrdemPessoa {
    public static void main(String[] args) {
        List<Pessoa> listaBruta = List.of(
                new Pessoa("Rodrigo", 35),
                new Pessoa("Amanda", 22),
                new Pessoa("Bruno", 28),
                new Pessoa("Amanda", 22), // Duplicada de propósito!
                new Pessoa("Carlos", 19),
                new Pessoa("Beatriz", 30)
        );

        Set<Pessoa> pessoasOrdenadas = new TreeSet<>(listaBruta);
        System.out.println("Lista ordenada: " + pessoasOrdenadas);
    }
}
