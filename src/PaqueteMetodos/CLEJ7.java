/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteMetodos;

import javax.swing.JOptionPane;

/**
 *
 * @author ferzincal
 */
public class CLEJ7 {
       // Atributos
    private int valor1;
    private int valor2;

    // Método para ingresar los valores
    public void ingresarValores() {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer valor entero:");
        valor1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo valor entero:");
        valor2 = Integer.parseInt(input2);
    }

    // Método para sumar los valores
    public void sumar() {
        int suma = valor1 + valor2;
        JOptionPane.showMessageDialog(null, "La suma de los valores es: " + suma);
    }

    // Método para restar los valores
    public void restar() {
        int resta = valor1 - valor2;
        JOptionPane.showMessageDialog(null, "La resta de los valores es: " + resta);
    }

    // Método para multiplicar los valores
    public void multiplicar() {
        int multiplicacion = valor1 * valor2;
        JOptionPane.showMessageDialog(null, "La multiplicación de los valores es: " + multiplicacion);
    }

    // Método para dividir los valores
    public void dividir() {
        if (valor2 != 0) {
            double division = (double) valor1 / valor2;
            JOptionPane.showMessageDialog(null, "La división de los valores es: " + division);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        CLEJ7 calculadora = new CLEJ7();
        calculadora.ingresarValores();
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();
    } 
}
