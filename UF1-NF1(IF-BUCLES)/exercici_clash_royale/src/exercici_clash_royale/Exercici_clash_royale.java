/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_clash_royale;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici_clash_royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copes, eleccio;
        
        
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Cuantas copas tienes?");
        
        copes = sc.nextInt();
        
        
      if (copes<2000)
      {
          System.out.println("Elige mago (0) o esbirro (1)");
          eleccio = sc.nextInt();
          if (eleccio ==1)
          {
              System.out.println("Has elegido mega esbirro");
          }
          else if (eleccio == 0)
          {
              System.out.println("Has elegido mago electrico");
          }
      }
      else
        {
          System.out.println("Opcion no valida");
        }
        if(copes>2000 && copes<3000)
        {
            System.out.println("Elige caballero (0) o bandida (1)");
            eleccio = sc.nextInt();
        }   
            if(eleccio == 1)
            {
                System.out.println("Has elegido Bandida");
            }
            else if ( eleccio == 0)
            {
                System.out.println("Has elegido Caballero");
            }
            else
            {
                System.out.println("Opcion no valida");
            }
            if(copes>=3000)
            {
               System.out.println("Elige entre esqueletos (0) o gigante (1)");
               eleccio = sc.nextInt();
               
            }
            if (eleccio == 1)
            {
                System.out.println("Has elegido gigante");
            }
            else if ( eleccio == 0)
            {
                System.out.println("Has elegido esqueletos");
            }
        }
        
    }
    

    

