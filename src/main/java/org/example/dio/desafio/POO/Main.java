package org.example.dio.desafio.POO;

import org.example.dio.desafio.POO.dominio.Curso;
import org.example.dio.desafio.POO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setCargaHoraria(10);
        curso.setDescricao("teste");
        curso.setTitulo("Protugues");
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("dsjafkl");
        mentoria.setTitulo("mentoria java");

        System.out.println(mentoria);
    }
}
