/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();
        
        System.out.println("Hola "+nombre);
        
        
    }
    
}
