/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesos;

import java.util.Scanner;

/**
 *
 * @author ferzincal
 */
public class Ejercicio_Private {
   private String marca;
   private  String placa;

    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String marcacarro;
        String placacarro;
        Ejercicio_Private invocar = new Ejercicio_Private();
        System.out.println("Ingrese la Marca de su carro: ");
        marcacarro = teclado.nextLine();
        invocar.setMarca(marcacarro);
        
        System.out.println("Ingrese La placa del carro: ");
        placacarro = teclado.nextLine();
        invocar.setPlaca(placacarro);
        
        
        System.out.println("La marca es: "+invocar.getMarca());
        System.out.println(" La plca es: "+invocar.getPlaca());
    }
   
}
