package com.politecnicomalaga.colegiolist;

public class alumnoprimaria extends alumno {

    public alumnoprimaria(String nombre, String apellido, String dni, String email, String tlf) {
        super(nombre, apellido, dni, email, tlf);

    }

    // Alumno primaria pasa de curso si la media es mayor de 3.5
    @Override
    public boolean pasarCurso() {

         float media = 0;
        float suma = 0;

        // Voy a recorrer todo el ArrayList de notas
        for (int i = 0; i < misNotas.size(); i++) {

            // Necesito calcular la suma de las notas
            suma += misNotas.get(i).getValorNota();
        }

        // Ahora realmente calculo la media
        media = suma / misNotas.size();

        // Teniendo la media, puedo verificar si la media es mayor a 3.5
        if (media > 3.5) {

            //Si lo es, pasa de curso
            return true;
        } else {

            //En otro caso, no
            return false;
        }
    }

}