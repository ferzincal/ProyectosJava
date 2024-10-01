package Retos;

/**
 *
 * @author ferzincal
 */
public class Clase_Principal2 {
 // Clase_Principal_Estudiante.java
    public static void main(String[] args) {
        Clase_Estudiante[] estudiantes = new Clase_Estudiante[10];

        // Crear 10 objetos de Clase_Estudiante
        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Clase_Estudiante();
        }

        // Asignar valores a los atributos de cada objeto
        estudiantes[0].setNombre("Juan");
        estudiantes[0].setEdad(20);
        estudiantes[0].setPromedio(8.5);
        estudiantes[0].setBecado(true);
        estudiantes[0].setGenero('M');

        estudiantes[1].setNombre("María");
        estudiantes[1].setEdad(21);
        estudiantes[1].setPromedio(9.0);
        estudiantes[1].setBecado(true);
        estudiantes[1].setGenero('F');

        estudiantes[2].setNombre("Pedro");
        estudiantes[2].setEdad(22);
        estudiantes[2].setPromedio(7.8);
        estudiantes[2].setBecado(false);
        estudiantes[2].setGenero('M');

        estudiantes[3].setNombre("Ana");
        estudiantes[3].setEdad(19);
        estudiantes[3].setPromedio(9.3);
        estudiantes[3].setBecado(true);
        estudiantes[3].setGenero('F');

        estudiantes[4].setNombre("Luis");
        estudiantes[4].setEdad(23);
        estudiantes[4].setPromedio(6.9);
        estudiantes[4].setBecado(false);
        estudiantes[4].setGenero('M');

        estudiantes[5].setNombre("Laura");
        estudiantes[5].setEdad(20);
        estudiantes[5].setPromedio(8.7);
        estudiantes[5].setBecado(true);
        estudiantes[5].setGenero('F');

        estudiantes[6].setNombre("Carlos");
        estudiantes[6].setEdad(24);
        estudiantes[6].setPromedio(7.5);
        estudiantes[6].setBecado(false);
        estudiantes[6].setGenero('M');

        estudiantes[7].setNombre("Sofía");
        estudiantes[7].setEdad(21);
        estudiantes[7].setPromedio(9.1);
        estudiantes[7].setBecado(true);
        estudiantes[7].setGenero('F');

        estudiantes[8].setNombre("Diego");
        estudiantes[8].setEdad(22);
        estudiantes[8].setPromedio(7.2);
        estudiantes[8].setBecado(false);
        estudiantes[8].setGenero('M');

        estudiantes[9].setNombre("Elena");
        estudiantes[9].setEdad(20);
        estudiantes[9].setPromedio(8.8);
        estudiantes[9].setBecado(true);
        estudiantes[9].setGenero('F');

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
    }
}


