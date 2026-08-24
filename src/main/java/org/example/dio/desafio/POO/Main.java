package org.example.dio.desafio.POO;

import org.example.dio.desafio.POO.dominio.BootCamp;
import org.example.dio.desafio.POO.dominio.Curso;
import org.example.dio.desafio.POO.dominio.Dev;
import org.example.dio.desafio.POO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de introdução a java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setDescricao("Curso de introduçao a API");
        curso2.setTitulo("API");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("Inteodução a mentoria");
        mentoria.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp java");
        bootCamp.setDescricao("Desciçao do bootCamp");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos " + devCamila.getConteudosIncritos());
        devCamila.progridir();
        devCamila.progridir();
        System.out.println("Conteudos concluidos " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos " + devJoao.getConteudosIncritos());
        devJoao.progridir();
        System.out.println("Conteudos inscritos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
