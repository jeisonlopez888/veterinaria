package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class Mascota {
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private char genero;
    private String color;
    private double peso;

    public Mascota(int id, String nombre, String especie, String raza, int edad, char genero, String color, double peso) {

        assert id != null && !id.isBlank() : "el id debe ser diferente de null";
        assert nombre != null && !nombre.isBlank() : "el nombre debe ser diferente de null";
        assert especie != null && !especie.isBlank(): "la especie debe ser deferente de null";
        assert raza!= null && !raza.isBlank () : " la raza debe ser deferente de null";
        assert edad > 0 : " la edad debe ser mayor a cero";
        assert genero!= null && !genero.isBlank () : " el genero debe ser deferente de null";
        assert color!= null && !color.isBlank () : " el color debe ser deferente de null";
        assert peso!= null && !peso.isBlank () : " el peso debe ser deferente de null";


        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "id{" + "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                ", genero=" + genero + '\'' +
                ", color=" + color +  '\'' +
                ",peso=" + peso + 
                '}';
}

