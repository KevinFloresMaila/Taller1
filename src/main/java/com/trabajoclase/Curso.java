package com.trabajoclase;

public final class Curso {
    private final String nombrecurso;
    private final int cantidadmaximaalumno;
    private final int cantidadinscritos;

    public Curso(String nombrecurso, int cantidadinscritos) {
        this.nombrecurso = nombrecurso;
        this.cantidadmaximaalumno = generarCantidadMaximaAlumnos();
        int inscritosReales = cantidadinscritos;

        if (cantidadinscritos > this.cantidadmaximaalumno) {
            System.out.println("La cantidad de inscritos (" + cantidadinscritos + ") excede la capacidad máxima de "+ this.cantidadmaximaalumno +" de la Materia "+ this.nombrecurso +" . Se ajusta a la capacidad máxima.");
            inscritosReales = this.cantidadmaximaalumno;
        }

        this.cantidadinscritos = inscritosReales;
    }

    private static int generarCantidadMaximaAlumnos() {
        int min = 20;
        int max = 35;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public int getCantidadmaximaalumno() {
        return cantidadmaximaalumno;
    }

    public int getCantidadinscritos() {
        return cantidadinscritos;
    }

    @Override
    public String toString() {
        return "Curso: " + nombrecurso + ", Inscritos: " + cantidadinscritos + ", Capacidad Maxima: " + cantidadmaximaalumno;
    }
}
