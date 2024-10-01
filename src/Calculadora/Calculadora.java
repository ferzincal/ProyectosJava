package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{
    //Atributos
    private JLabel ETitulo;
    private JLabel ECantidad1;
    private JTextField TxtCantidad1;
     private JLabel ECantidad2;
     private JTextField TxtCantidad2;
     private JButton BtnSumar;
      private JLabel  EResultado;
     
    //Metodos
    public void ingresar(){
    ETitulo = new JLabel("C a l c u l a d o r a");
         ETitulo.setBounds(200,20,500,20); //Tamaño de etiqueta: CFAA
         add(ETitulo);//Agrega la etiqueta al formulario
         
         //Inicializar etiqueta ECantidad1
         ECantidad1 = new JLabel("Ingrese primera cantidad: ");
         ECantidad1.setBounds(50,50,150,20);
         add(ECantidad1);
         
         //Caja de texto TxtCantidad1
         TxtCantidad1 = new  JTextField();
         TxtCantidad1.setBounds(200,50,150,20);
         add(TxtCantidad1);
         
         //Inicializar etiqueta ECantidad2
         ECantidad2 = new JLabel("Ingrese segunda cantidad: ");
         ECantidad2.setBounds(50,100,200,20);
         add(ECantidad2);
         
         //Caja de texto TxtCantidad2
         TxtCantidad2 = new  JTextField();
         TxtCantidad2.setBounds(200,100,150,20);
         add(TxtCantidad2);
         
         //Dibujando botones BtnSumar
                BtnSumar = new JButton("S u m a r");
                BtnSumar.setBounds(50,150,100,20);
                add(BtnSumar);
                        
                 BtnSumar.addActionListener(this); 
                 //ciere de Formulario
                 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fin metodo ingresar
   @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnSumar) {           
            try {
                int x1 = Integer.parseInt(TxtCantidad1.getText());
                int x2 = Integer.parseInt(TxtCantidad2.getText());
                int suma = x1 + x2;
                String total = String.valueOf(suma);

                // Mostrar el resultado en la etiqueta EResultado
                EResultado.setText("Resultado: " + total);
            } catch (NumberFormatException ex) {
                // Manejar el error si el usuario no ingresa un número válido
                EResultado.setText("Error: Ingrese números válidos");
            }
        }
    }
    //Metodo principal:main
    public static void main(String[] args) {
        //Declara y crear un objeto formulario de la clase 
        Calculadora formulario = new Calculadora();
        int columna = 200;
        int fila = 10;
        int ancho = 500;
        int altura = 500;
        formulario.setBounds(columna ,fila ,ancho,altura);
        formulario.setVisible(true);
        formulario.setLayout(null);//permite poner objetos en cualquier lado del formulario
        formulario.ingresar();
//
        
    }//fin metodo main
}//metodo calculadora
