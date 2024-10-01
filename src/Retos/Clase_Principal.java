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
public class Clase_Principal {
    // Clase_Principal.java
    public static void main(String[] args) {
        Clase_Persona[] personas = new Clase_Persona[10];

        // Crear 10 objetos de Clase_Persona
        for (int i = 0; i < 10; i++) {
            personas[i] = new Clase_Persona();
        }

        // Asignar datos usando setNombre() y setEdad()
        personas[0].setNombre("Juan");
        personas[0].setEdad(25);

        personas[1].setNombre("María");
        personas[1].setEdad(30);

        personas[2].setNombre("Pedro");
        personas[2].setEdad(28);

        personas[3].setNombre("Ana");
        personas[3].setEdad(22);

        personas[4].setNombre("Luis");
        personas[4].setEdad(27);

        personas[5].setNombre("Laura");
        personas[5].setEdad(32);

        personas[6].setNombre("Carlos");
        personas[6].setEdad(26);

        personas[7].setNombre("Sofía");
        personas[7].setEdad(29);

        personas[8].setNombre("Diego");
        personas[8].setEdad(24);

        personas[9].setNombre("Elena");
        personas[9].setEdad(31);

        // Mostrar datos usando getNombre() y getEdad()
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println(); // Línea de por medio
        }
    }
}

