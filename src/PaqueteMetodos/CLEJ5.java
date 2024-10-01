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
public class CLEJ5 {
     private double valor1, valor2, valor3;

    public void ingresarValores() {
        // Ingresar valores usando JOptionPane
        String input1 = JOptionPane.showInputDialog("Ingrese el primer valor:");
        valor1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo valor:");
        valor2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Ingrese el tercer valor:");
        valor3 = Double.parseDouble(input3);
    }

    public void mostrarMayorMenor() {
        // Determinar mayor y menor
        double mayor = valor1;
        double menor = valor1;

        if (valor2 > mayor) {
            mayor = valor2;
        } else if (valor2 < menor) {
            menor = valor2;
        }

        if (valor3 > mayor) {
            mayor = valor3;
        } else if (valor3 < menor) {
            menor = valor3;
        }

        // Mostrar resultados
        String mensaje = "El mayor valor es: " + mayor + "\nEl menor valor es: " + menor;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void main(String[] args) {
        CLEJ5 mm = new CLEJ5();
        mm.ingresarValores();
        mm.mostrarMayorMenor();
    } 
}
