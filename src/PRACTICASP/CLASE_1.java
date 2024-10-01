/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICASP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class CLASE_1 extends JFrame implements ActionListener {
    // Atributos
    private JLabel ETitulo;
    private JLabel ECantidad1;
    private JTextField TxtCantidad1;
    private JLabel ECantidad2;
    private JTextField TxtCantidad2;
    private JButton BtnOperar;
    private JLabel EResultado;
    private JTextField TxtResultado;
    private JMenuBar menuBar;
    private JMenu menuCambiarColor;
    private JMenuItem menuItemRojo;
    private JMenuItem menuItemVerde;
    private JMenuItem menuItemAzul;
    private JComboBox<String> operacionComboBox; // JComboBox para las operaciones

    // Constructor
    public CLASE_1() {
        // Configuración básica del JFrame
        setTitle("Calculadora Aritmetica");
        setLayout(null); // Permite posicionar componentes manualmente

        // Inicialización de componentes
        ETitulo = new JLabel("C a l c u l a d o r a");
        ETitulo.setBounds(300, 20, 500, 20);
        add(ETitulo);

        ECantidad1 = new JLabel("Ingrese primera cantidad: ");
        ECantidad1.setBounds(50, 50, 150, 20);
        add(ECantidad1);

        TxtCantidad1 = new JTextField();
        TxtCantidad1.setBounds(200, 50, 150, 20);
        add(TxtCantidad1);

        ECantidad2 = new JLabel("Ingrese segunda cantidad: ");
        ECantidad2.setBounds(50, 100, 200, 20);
        add(ECantidad2);

        TxtCantidad2 = new JTextField();
        TxtCantidad2.setBounds(200, 100, 150, 20);
        add(TxtCantidad2);

        BtnOperar = new JButton("O p e r a r");
        BtnOperar.setBounds(50, 150, 100, 20);
        add(BtnOperar);
        BtnOperar.addActionListener(this);

        TxtResultado = new JTextField();
        TxtResultado.setBounds(200, 250, 100, 20);
        TxtResultado.setEnabled(false);
        add(TxtResultado);

        EResultado = new JLabel();
        EResultado.setBounds(200, 150, 150, 20);
        add(EResultado);

        // Configuración del menú
        menuBar = new JMenuBar();
        menuCambiarColor = new JMenu("Cambiar Color");

        menuItemRojo = new JMenuItem("Rojo");
        menuItemVerde = new JMenuItem("Verde");
        menuItemAzul = new JMenuItem("Azul");

        menuItemRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        menuItemVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.GREEN);
            }
        });

        menuItemAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });

        menuCambiarColor.add(menuItemRojo);
        menuCambiarColor.add(menuItemVerde);
        menuCambiarColor.add(menuItemAzul);

        menuBar.add(menuCambiarColor);
        setJMenuBar(menuBar);

        // JComboBox para seleccionar operaciones
        String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
        operacionComboBox = new JComboBox<>(operaciones);
        operacionComboBox.setBounds(50, 200, 150, 20);
        add(operacionComboBox);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // ActionListener para el botón Operar
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnOperar) {
            int x1 = Integer.parseInt(TxtCantidad1.getText());
            int x2 = Integer.parseInt(TxtCantidad2.getText());
            String operacionSeleccionada = (String) operacionComboBox.getSelectedItem();
            int resultado = 0;
            switch (operacionSeleccionada) {
                case "Suma":
                    resultado = x1 + x2;
                    break;
                case "Resta":
                    resultado = x1 - x2;
                    break;
                case "Multiplicación":
                    resultado = x1 * x2;
                    break;
                case "División":
                    if (x2 != 0) {
                        resultado = x1 / x2;
                    } else {
                        EResultado.setText("Error: División por 0");
                        return;
                    }
                    break;
            }
            String total = String.valueOf(resultado);
            TxtResultado.setText(total);
            EResultado.setText(total);
        }
    }

    // Método principal
    public static void main(String[] args) {
        CLASE_1 formulario = new CLASE_1();
        formulario.setBounds(200, 10, 800, 600);
        formulario.setVisible(true);
    }
}