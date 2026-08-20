package org.example.dio.ordem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        List<Email> emailsBrutos = List.of(
                new Email("carlos@outlook.com"),
                new Email("ana@gmail.com"),
                new Email("bruno@hotmail.com"),
                new Email("ana@gmail.com"),    // Duplicado
                new Email("bruno@hotmail.com")
        );

        // Apenas remover os emails duplicados utilizasse o HashSet
        Set<Email> emailsUnicos = new HashSet<>(emailsBrutos);
        System.out.println("Sem duplicadas (HashSet): " + emailsUnicos);

        // Remover duplicadas e ordenar A-Z automaticamente TreeSet
        Set<String> emailsOrdenadosStrings = new TreeSet<>();
        for (Email e : emailsBrutos){
            emailsOrdenadosStrings.add(e.getEmail());
        }
        System.out.println("Ordenados A-Z (TreeSet): " + emailsOrdenadosStrings);
    }
}



