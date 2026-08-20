package org.example.dio.ordemAlfa;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoas = (Pessoa) o;
        return idade == pessoas.idade && Objects.equals(nome, pessoas.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
//
//    @Override
//    public int compareTo(Pessoa outro) {
//        return this.nome.compareTo(outro.getNome());
//    }

    @Override
    public int compareTo(Pessoa outra) {
        return Integer.compare(outra.getIdade(), this.idade);
    }
}
