/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_meses;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Switch_meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char meses;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un mes");
        meses = sc.next().charAt(0);
        
        switch(meses)
        {
            case 'e':
                System.out.println("Enero");
                break;
            case 'f':
                System.out.println("Febrero");
                break;
            case 'm':
                System.out.println("Marzo");
                break;
            case 'a':
                System.out.println("Abril");
                break;
            default: 
                System.out.println("Letra no válida");
                break;
        
        }
    }
    
}
