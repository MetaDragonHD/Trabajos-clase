/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.para.que.la.tisher.vea.que.si.le.c;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class ProyectoParaQueLaTisherVeaQueSiLeC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int A=0;
        Scanner SI = new Scanner(System.in);
        System.out.println("Da tu edad: ");
        A = SI.nextInt();
        if (A>=18)
        {
            System.out.println("Usted es mayor de edad, felicidades");
        }
        else
        {
            System.out.println("Usted es menor de edad, lo siento");
        }
    }
    
}
