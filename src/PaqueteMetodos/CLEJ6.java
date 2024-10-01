package PaqueteMetodos;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferzincal
 */
public class CLEJ6 {
       // Atributos
    private String nombre;
    private double sueldo;

    // Método para ingresar los datos del empleado
    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String inputSueldo = JOptionPane.showInputDialog("Ingrese el sueldo del empleado:");
        sueldo = Double.parseDouble(inputSueldo);
    }

    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        String mensaje = "Nombre del empleado: " + nombre + "\nSueldo: " + sueldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Método para verificar si debe pagar impuestos
    public void verificarImpuestos() {
        if (sueldo > 3000) {
            JOptionPane.showMessageDialog(null, nombre + " debe pagar impuestos.");
        } else {
            JOptionPane.showMessageDialog(null, nombre + " no debe pagar impuestos.");
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        CLEJ6 empleado = new CLEJ6();
        empleado.ingresarDatos();
        empleado.mostrarDatos();
        empleado.verificarImpuestos();
    }
}
