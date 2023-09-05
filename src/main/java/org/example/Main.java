package org.example;

import org.example.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso(1,"Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso(2,"Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso(3,"Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso(4,"Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso(5,"Cursos profesional de Escritura", 1.5f, 10, 300 ));;
    }
}