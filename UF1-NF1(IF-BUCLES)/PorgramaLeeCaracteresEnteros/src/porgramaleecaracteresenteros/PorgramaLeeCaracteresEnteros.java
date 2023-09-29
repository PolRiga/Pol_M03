/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porgramaleecaracteresenteros;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class PorgramaLeeCaracteresEnteros {

    /**
     * @param args the command line arguments
     * te va a pedir a que clase vas (A/B/C)
     * te va a pedir una edad
     * a la clase A van los adultos
     * y a la clase B o C van los menores de edad
     * el programa tiene que comprobar que estás en la clase correcta
     */
     
    public static void main(String[] args) {
        int edad;
        char clase; // character
        Scanner sc = new Scanner(System.in);
        System.out.println("A que clase vas? ");
        clase = sc.next().charAt(0);
        System.out.println("Vas al grupo " + clase);
        System.out.print("Que edad tienes");
        edad = sc.nextInt();
        System.out.println("Tienes " + edad + " años");
        
        
        if (clase=='A' && edad>=18)
        {
            System.out.println("Vas a la clase correcta" + "(" + clase + ")");
        }
        else if ((clase=='B'|| clase=='C') && edad < 18)
        {
            System.out.println("Vas a la clase correcta" + "(" + clase + ")");
        }    
        else
        {
         System.out.println("Por tus datos y edad no debes ir a esta clase");
        }
    }
    
}
