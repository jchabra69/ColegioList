package com.politecnicomalaga.colegiolist;

public class alumnobach extends alumno {

    public alumnobach(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);

    }

    //Alumno bach pasa de curso si la nota es 5 y no hay ninguna suspensa
    @Override
    public boolean pasarCurso() {

        float media = 0;
        float suma = 0;
        float suspenso = 0;

        // Voy a recorrer todo el array de notas
        for (int i = 0; i < misNotas.size(); i++) {

            // Necesito calcular su media
            // Así que sumaré cada iteración
            suma += misNotas.get(i).getValorNota();

            // Y luego haré la media
            media = suma / misNotas.size();

            // Si una nota es menor de 4
            if (misNotas.get(i).getValorNota() < 4) {

                suspenso++;
                break;

            }

        }

        // Si no tiene ningun suspenso y su media es 5 o más
        if (suspenso == 0 && media >= 5) {

            // El alumno pasa
            return true;

        } else {

            return false;
        }

    }

}
