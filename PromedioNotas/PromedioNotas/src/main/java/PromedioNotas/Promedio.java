/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioNotas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);

        int [] prome;
        prome= new int[5];

        int i;
        float total=0;
        for(i=0;i<5;++i)
        {
            //JOptionPane.showMessageDialog(null,"Bienvenido al programa Promedio Alumno");
            System.out.println("BIENVENIDO AL PROGRAMA PROMEDIO ALUMNO");
            System.out.println("ingrese calificaciones de alumnos "+i+": ");
            //JOptionPane.showMessageDialog(null,"Ingrese calificaciones del alumno de 0 a 100 pts "+i+":");
            prome[i]=teclado.nextInt();
           total=total+prome[i];
        }
        System.out.println("El total de las notas es: "+total);
        total= total/5;
        System.out.println("El promedio general de notas es: "+total);
        for(i=4;i>=0;--i)
            System.out.println("alumno "+i+" su promedio es: "+prome[i]);  
    }        
        
}
