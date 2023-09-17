package Desafios.BootcampPOO;

import Desafios.BootcampPOO.Dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Aprendendo conceitos básicos");
        cursoJava.setCargaHoraria(8);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Dev Python");
        cursoPython.setDescricao("Aprendendo conceitos da linguagem python");
        cursoPython.setCargaHoraria(8);

        Curso cursoJavascript = new Curso();
        cursoJavascript.setTitulo("JavaScript para iniciantes");
        cursoJavascript.setDescricao("Aprendendo conceitos básicos de javascript");
        cursoJavascript.setCargaHoraria(8);

        Mentoria mentoriaInicial = new Mentoria();
        mentoriaInicial.setTitulo("Aprendendo Orientação a objetos");
        mentoriaInicial.setDescricao("Entendendo os pilares da Orientação a objetos");
        mentoriaInicial.setData(LocalDateTime.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setInicio(LocalDate.now());
        bootcampJava.setFim(bootcampJava.getInicio().plusDays(45));
        bootcampJava.setNome("Java Start");
        List<ConteudoEducacional> conteudosBootcamp = Arrays.asList( cursoPython, cursoJavascript);
        bootcampJava.setConteudos(conteudosBootcamp);

        Dev alex = new Dev();
        alex.setNome("Alex");
        alex.inscrever(cursoJava);
        alex.inscrever(bootcampJava);
        alex.exibir();
        alex.progredir();
        alex.progredir();
        alex.exibir();
        System.out.println(String.format("XP Alex: %.2f",alex.TotalXp()));
    }
    }
