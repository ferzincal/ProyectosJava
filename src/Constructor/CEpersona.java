/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author ferzincal
 */
public class CEpersona {
    String nombre;
int edad;
float altura;
Double peso;

    @Override
    public String toString() {
        return "CEpersona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    


public CEpersona(){
nombre="Nelly";
edad=41;
altura=1.60f;
peso=5.6;
}

public CEpersona(String vlnombre,int vledad, float vlaltura, double vlpeso){
nombre = vlnombre;
edad=vledad;
altura=vlaltura;
peso=vlpeso;
}

public CEpersona(String vlnombre,int vledad){
nombre = vlnombre;
edad=vledad;
}

public static void main(String[] args) {
CEpersona ObjPersona1 = new CEpersona();
CEpersona ObjPersona2 = new CEpersona("Haroldo Turcios",50,1.67f,3.6);
CEpersona ObjPersona3 = new CEpersona("Daniel Sincal", 20, 1.80f,78);
CEpersona ObjPersona4  = new CEpersona("Maria",40);

System.out.println(ObjPersona1.toString());
System.out.println(ObjPersona2.toString());
System.out.println(ObjPersona3.toString());
    System.out.println(ObjPersona4.toString());
}
}

