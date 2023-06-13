package com.politecnicomalaga.colegiolist;

public class Nota {

    private String asignatura;
    private float valorNota;

    public Nota(String asignatura, float valorNota) {
        this.asignatura = asignatura;
        // this.valorNota = valorNota;

        // Si valor de nota es mayor que 0 y valor de nota es menor que 10
        // Esto es para que no asigne ningun numero entre 0 y 10, < >
        if (valorNota >= 0 && valorNota <= 10) {

            // Asigno
            this.valorNota = valorNota;

        } else {

            throw new IllegalArgumentException("Holiwis, tas equivocado, debes poner un numero entre 0 y tu 10");

        }

    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public float getValorNota() {
        return valorNota;
    }

    public void setValorNota(float valorNota) {
        this.valorNota = valorNota;
    }

}
