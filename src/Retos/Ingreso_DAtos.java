package Retos;

import java.util.Scanner;

/**
 *
 * @author ferzincal
 */
public class Ingreso_DAtos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Clase_Estudiante[] estudiantes = new Clase_Estudiante[10];

        // Crear 10 objetos de Clase_Estudiante
        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Clase_Estudiante();

            // Solicitar y capturar datos del usuario
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            estudiantes[i].setNombre(teclado.nextLine());

            System.out.print("Edad: ");
            estudiantes[i].setEdad(teclado.nextInt());

            System.out.print("Promedio: ");
            estudiantes[i].setPromedio(teclado.nextDouble());

            System.out.print("¿Está becado? (true/false): ");
            estudiantes[i].setBecado(teclado.nextBoolean());

            System.out.print("Género (M/F): ");
            estudiantes[i].setGenero(teclado.next().charAt(0));

            teclado.nextLine(); // Limpiar el buffer
            System.out.println(); // Línea de por medio
        }

        // Mostrar los valores de cada objeto
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Edad: " + estudiantes[i].getEdad());
            System.out.println("Promedio: " + estudiantes[i].getPromedio());
            System.out.println("Becado: " + (estudiantes[i].isBecado() ? "Sí" : "No"));
            System.out.println("Género: " + estudiantes[i].getGenero());
            System.out.println(); // Línea de por medio
        }

        teclado.close(); // Cerrar el scanner
    }
}
  
