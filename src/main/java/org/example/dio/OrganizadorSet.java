package org.example.dio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OrganizadorSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "Drama", 60));
            add(new Serie("that", "Comedia", 25));
        }};
        for ( Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class Serie {
    private String nome;
    private String genero;
    private  Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer temnoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = temnoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", temnoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}
