/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;

/**
 *
 * @author ferzincal
 */
public class Clase_Estudiante {
  // Clase_Estudiante.java
    private String nombre;
    private int edad;
    private double promedio;
    private boolean becado;
    private char genero;

    // Métodos set para asignar valores a los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Métodos get para obtener valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean isBecado() {
        return becado;
    }

    public char getGenero() {
        return genero;
    }
}
  
