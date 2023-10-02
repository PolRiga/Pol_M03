/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici_clash_lletres;

import java.util.Scanner;

/**
 *
 * @author pori9503
 */
public class Exercici_clash_lletres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copes;
        char eleccio;
        
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Cuantas copas tienes?");
        
        copes = sc.nextInt();
        
        
      if (copes<2000)
      {
          System.out.println("Elige mago (m) o esbirro (e)");
          eleccio = sc.next().charAt(0);
            switch (eleccio) {
                case 'e':
                case 'E':
                    System.out.println("Has elegido mega esbirro");
                    break;
                case 's':
                case 'S':
                    System.out.println("Has elegido mago electrico");
                    break;
                    
                case 'c':
                case 'C':
                    System.out.println("Has elegido Caballero");
                    break;
                    
                case 'b':
                case 'B':
                    System.out.println("Has elegido Bandida");
                    break;  
                case 'g':
                case 'G':
                    System.out.println("Has elegido gigante");
                    break;
                case 'j':
                case 'J':
                    System.out.println("Has elegido ejercito de esqueletos");
                    break;   
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
      }
      else if(copes>2000 && copes<3000)
        {
            System.out.println("Elige caballero (c) o bandida (b)");
            eleccio = sc.next().charAt(0);
            
            if(eleccio == 'c')
            {
                System.out.println("Has elegido Bandida");
            }
            else if ( eleccio == 'b')
            {
                System.out.println("Has elegido Caballero");
            }
            
        }   
      else  if(copes>=3000)
            {
               System.out.println("Elige entre esqueletos (j) o gigante (g)");
               eleccio = sc.next().charAt(0);
               
               if (eleccio == 'j')
            {
                System.out.println("Has elegido gigante");
            }
            else if ( eleccio == 'g')
            {
                System.out.println("Has elegido esqueletos");
            }
            }
            
        }
        
    }
    
    

