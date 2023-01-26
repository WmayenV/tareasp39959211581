/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author daguilae
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float opc=0,dato1=0,dato2=0,result=0;
        JOptionPane.showMessageDialog(null,"A continuacion ingrese la opcion de la operacion que desea realizar"); 
        JOptionPane.showMessageDialog(null,"1.-sumar    2.-restar   3.-multiplicar  4.-dividir ||otro numero.-salir||");
       // System.out.println("A continuacion ingrese la opcion de la operacion que desea realizar");
       // System.out.println("1.-sumar    2.-restar   3.-multiplicar  4.-dividir  otro numero.-salir");
       // System.out.println("seleccione una opcion: ");
        opc=Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion de la operacion que desea realizar: "));

        if(opc>0&&opc<5){
            dato1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
            dato2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        if(opc!=0){
            if(opc==1)
                result=dato1+dato2;
            if(opc==2)
                result=dato1-dato2;
            if(opc==3)
                result=dato1*dato2;
            if(opc==4)
                result=dato1/dato2;
            System.out.print("el resultado de la operacion es: ");
            System.out.println(result);
        }
        JOptionPane.showMessageDialog(null, "el resultado es: "+result);
        }
            System.out.println("saliendo del programa Operaciones Basicas...");
            JOptionPane.showMessageDialog(null,"adios, que tenga un buen dia");        
    }
    
}
