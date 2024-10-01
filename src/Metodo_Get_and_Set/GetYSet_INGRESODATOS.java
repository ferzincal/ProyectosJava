package Metodo_Get_and_Set;

import java.util.Scanner;

/**
 *
 * @author ferzincal
 */
public class GetYSet_INGRESODATOS {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Personas persona = new Personas();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos de la persona " + i + ":");
            System.out.print("Ingrese el nombre de la persona: ");
            persona.setNombrePersona(teclado.nextLine());

            System.out.print("Ingrese la edad de la persona: ");
            persona.setEdadPersona(teclado.nextInt());
            teclado.nextLine(); 

            System.out.print("Ingrese la estatura de la persona (en metros): ");
            persona.setEstaturaPersona(teclado.nextFloat());
            teclado.nextLine(); 

            System.out.print("Ingrese el género de la persona (M/F): ");
            persona.setGeneroPersona(teclado.next().charAt(0));
            teclado.nextLine(); 

            System.out.print("Ingrese el peso de la persona: ");
            persona.setPesoPersona(teclado.nextDouble());
            teclado.nextLine(); 

            System.out.print("¿La persona es soltera? (true/false): ");
            persona.setSolteroPersona(teclado.nextBoolean());
            teclado.nextLine(); 

            System.out.println("-----------------------------------------------------/");
            System.out.println("Nombre del objeto persona "+ i + ": " + persona.getNombrePersona());
            System.out.println("Edad del objeto persona: " + persona.getEdadPersona());
            System.out.println("Estatura del objeto persona: " + persona.getEstaturaPersona());
            System.out.println("Genero del objeto persona: " + persona.getGeneroPersona());
            System.out.println("Peso del objeto persona: " + persona.getPesoPersona());
            System.out.println("El estado del objeto persona: " + persona.isSolteroPersona());
            System.out.println();
        }
    }
}

