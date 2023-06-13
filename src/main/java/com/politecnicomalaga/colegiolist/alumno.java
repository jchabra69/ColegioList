package com.politecnicomalaga.colegiolist;

import java.util.ArrayList;

public abstract class alumno extends Persona {

    // Lecturas masivas
    // Modificaciones
    protected ArrayList<Nota> misNotas;

    public alumno(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);
        this.misNotas = new ArrayList<>();

    }

    public void agregarNota(String asignatura, float valorNota) {

        // Busco la primera posición disponible en mi array de notas
        for (int i = 0; i < misNotas.size(); i++) {

            // Si encuentras una posición del array vacía
            if (misNotas.iterator() == null) {

                // Y si los parametros no están vacios
                if (!asignatura.isEmpty() && valorNota != 0.0f) {

                    // Crea un objeto nota
                    Nota n = new Nota(asignatura, valorNota);

                    // Y lo metes en la iteración del array, es decir, en la primera posición
                    // disponible
                    misNotas[i] = n;

                }

            }

        }

    }

    // Determinar si un alumno ha pasado de curso o no
    public boolean alumnoPasa() {

        return true;

    }

    @Override
    abstract public boolean pasarCurso();

}
