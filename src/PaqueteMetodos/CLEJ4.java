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
public class CLEJ4 {
    static Scanner teclado = new Scanner(System.in);
 //declarando un método(función) estatica
 public static void sumar(){
 int numero1,numero2,resultado;
 System.out.println("Suma");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 numero2=teclado.nextInt();
 resultado = (numero1 + numero2);
 System.out.println("El resultado de la suma es: "+resultado);
 }//fin metodo sumar()
 
 public static void resta(){
 int numero1,numero2,resultado;
 System.out.println("Resta");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 numero2=teclado.nextInt();
 resultado = (numero1 - numero2);
 System.out.println("El resultado de la resta es: "+resultado);
 }//fin metodo restar()
 
 public static void multiplicar(){
 int numero1,numero2,resultado;
 System.out.println("Multiplicar");
 System.out.println("Ingrese primer numero: ");
 numero1=teclado.nextInt();
 numero2=teclado.nextInt();
 resultado = (numero1 * numero2);
 System.out.println("El resultado de la multiplicacion es: "+resultado);
 }//fin metodo multiplicar()
 
 public static void dividir(){
    int numero1,numero2,resultado;
    System.out.println("Division");
    System.out.println("Ingrese primer numero: ");
    numero1=teclado.nextInt();
    System.out.println("Ingrese segundo numero: ");
    numero2=teclado.nextInt();
    while(numero2==0){
             System.out.println("Error. No puede divir por cero");
             System.out.println("");
             System.out.print("Ingrese un divisor diferente de cero: ");
             numero2=teclado.nextInt();
        }
    resultado = (numero1 / numero2);
    System.out.println("El resultado de la division es: "+resultado);
 }
 
 public static void main(String[] args) {
 int opcion;
 do {
 System.out.println("Calculadora usando metodos");
 System.out.println("1.....Sumar");
 System.out.println("2.....Restar");
 System.out.println("3.....Multiplicar");
 System.out.println("4.....Dividir");
 System.out.println("5.....Salir");
 System.out.println("");
 System.out.println("Seleccione una opcion");
 opcion=teclado.nextInt();
         switch(opcion){
          case 1: {
            sumar();//invocando al metodo sumar()
           break;
          }
           case 2:{
           resta();
          }
           case 3:{
               multiplicar();
           }
           case 4:{
               dividir();
           }
 
 }//fin switch() 
 } while (opcion!=5); 
 }//fin metodo main()
}//fin clase Calculado

