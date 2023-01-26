/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioNotas;

import java.util.Scanner;

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
            System.out.println("ingrese calificacion del alumno "+i+": ");
            prome[i]=teclado.nextInt();
           total=total+prome[i];
        }
        System.out.println("total es: "+total);
        total= total/5;
        System.out.println("promedio general es: "+total);
        for(i=19;i>=0;--i)
            System.out.println("alumno "+i+" su promedio es: "+prome[i]);  
    }        
        
}
