package com.trabajoclase;

public class Main {
    public static void main(String[] args) {
        Curso[][] cursos = new Curso[3][];
        cursos[0] = new Curso[5];
        cursos[0][0] = new Curso("Matematica", 18);
        cursos[0][1] = new Curso("Fisica", 25);
        cursos[0][2] = new Curso("Quimica", 20);

        cursos[1] = new Curso[7];
        cursos[1][0] = new Curso("Matematica", 32);
        cursos[1][1] = new Curso("Fisica", 15);
        cursos[1][2] = new Curso("Quimica", 28);
        cursos[1][3] = new Curso("Biologia", 32);
        cursos[1][4] = new Curso("Historia", 32);
        cursos[1][5] = new Curso("Geografia", 32);

        cursos[2] = new Curso[4];
        cursos[2][0] = new Curso("Literatura", 18);
        cursos[2][1] = new Curso("Artes", 25);
        cursos[2][2] = new Curso("Botanica ", 20);
        cursos[2][3] = new Curso("Programacion", 34);

        for (int i = 0; i < cursos.length; i++) {
            for (int j = 0; j < cursos[i].length; j++) {
                if (cursos[i][j] != null) {
                    System.out.println(cursos[i][j]);
                }
            }
        }


    }
}