/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteMetodos;
import java.util.Scanner;

/**
 *
 * @author ferzincal
 */
public class ClEJ1 {
    Scanner teclado=new Scanner(System.in);
    public void ingresarValor(){
    int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
        }//fin metodo ingresarValor()
    public void calcular(int v) {
    System.out.println("El cuadrado de: "+v +" es: " +(v*v));
    }//fin metodo calcular()

    public static void main(String[] ar) {
    ClEJ1 invocar;
    invocar=new ClEJ1();
    invocar.ingresarValor();
    }//fin metodo main()
   //fin metodo clase cuadrad
   }

