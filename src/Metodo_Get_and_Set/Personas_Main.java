package Metodo_Get_and_Set;
/**
 *
 * @author ferzincal
 */
public class Personas_Main {
    public static void main(String[] args) {
        System.out.println("---Objetos de la Clase Persona---");
       
        //crear objeto persona 1: Daniel Sincal 
        Personas persona1 = new Personas();
        Personas persona2 = new Personas();
        Personas persona3 = new Personas();
        
       //Asignar Datos al objeto Persona1 utilizando los metodos set ded cada atributo 
       persona1.setNombrePersona("Daniel Sincal");
        System.out.println("Nombre del Objeto Persona1: "+persona1.getNombrePersona());
       persona1.setEdadPersona(20);
        System.out.println("La edad del objeto Persona1: "+persona1.getEdadPersona());
       persona1.setEstaturaPersona(1.81f);
        System.out.println("La estatura del Objeto Persona1: "+persona1.getEstaturaPersona());
       persona1.setGeneroPersona('M');
        System.out.println("El genero del Objeto Persona1: "+persona1.getGeneroPersona());
       persona1.setPesoPersona(75);
        System.out.println("El peso del Objeto Persona1: "+persona1.getPesoPersona());
       persona1.setSolteroPersona(false);
        System.out.println("El estado del Objeto Persona1: "+persona1.isSolteroPersona());
       
    
//Asignar Datos al objeto Persona1 utilizando los metodos set ded cada atributo
 System.out.println("\n");
       persona2.setNombrePersona("Katy");
        System.out.println("Nombre del Objeto Persona1: "+persona2.getNombrePersona());
       persona2.setEdadPersona(19);
        System.out.println("La edad del objeto Persona1: "+persona2.getEdadPersona());
       persona2.setEstaturaPersona(1.72f);
        System.out.println("La estatura del Objeto Persona1: "+persona2.getEstaturaPersona());
       persona2.setGeneroPersona('F');
        System.out.println("El genero del Objeto Persona1: "+persona2.getGeneroPersona());
       persona2.setPesoPersona(60);
        System.out.println("El peso del Objeto Persona1: "+persona2.getPesoPersona());
       persona2.setSolteroPersona(false);
        System.out.println("El estado del Objeto Persona1: "+persona2.isSolteroPersona());
       
        
        //Asignar Datos al objeto Persona1 utilizando los metodos set ded cada atributo 
        System.out.println("\n");
       persona3.setNombrePersona("El Yojans");
        System.out.println("Nombre del Objeto Persona1: "+persona3.getNombrePersona());
       persona3.setEdadPersona(21);
        System.out.println("La edad del objeto Persona1: "+persona3.getEdadPersona());
       persona3.setEstaturaPersona(1.70f);
        System.out.println("La estatura del Objeto Persona1: "+persona3.getEstaturaPersona());
       persona3.setGeneroPersona('M');
        System.out.println("El genero del Objeto Persona1: "+persona3.getGeneroPersona());
       persona3.setPesoPersona(65);
        System.out.println("El peso del Objeto Persona1: "+persona3.getPesoPersona());
       persona3.setSolteroPersona(false);
        System.out.println("El estado del Objeto Persona1: "+persona3.isSolteroPersona());
       
    }
}