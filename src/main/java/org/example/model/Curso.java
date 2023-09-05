package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    private Integer id;
    private String titulo;
    private Float duracion; //Expresada en horas
    private Integer videos; //cantidad de vídeos
    private Integer alumnos; //Cantidad de alumnos
}