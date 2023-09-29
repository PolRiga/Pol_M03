/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici16_goku;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class EXERCICI16_GOKU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina és la teva nota? ");
        nota = sc.nextDouble();
        
        if(nota >= 0 && nota<3)
        {
            System.out.println("Tu nota es Muy Deficiente");       
        }
        else if(nota >= 3 && nota<5)
        {
            System.out.println("Tu nota es Insuficiente");
        }
        else if(nota >= 5 && nota<6)
        {
            System.out.println("Tu nota es Bien");
        }
        else if(nota >= 6 && nota<9)
        {
            System.out.println("Tu nota es un Notable");
        }
        else if(nota >= 9 && nota<10)
        {
            System.out.println("Tu nota es Sobresaliente");
        }
    }
    
}
