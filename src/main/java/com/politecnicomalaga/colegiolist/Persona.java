package com.politecnicomalaga.colegiolist;

public abstract class Persona {

    protected String nombre, apellido, dni, email, tlf;

    public Persona(String nombre, String apellido, String dni, String email, String tlf) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.tlf = tlf;

    }

    @Override
    public String toString() {

        return String.format("%10s,%10s,%10s,%10s,%10s,\n", nombre, apellido, dni, email, tlf);

    }

    public abstract boolean pasarCurso();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

}
