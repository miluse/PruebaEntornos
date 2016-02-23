/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loro;

/**
 *
 * @author Manolo
 */
import java.util.Scanner;
public class Principal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Loro miPrimerLoro = new Loro("Salem","negro",20);
        Loro segundoLoro = new Loro("Flafly", "amarillo",4);
        Loro tercerLoro = new Loro (null, null, 0);
        
        System.out.println("Tengo un loro llamado " + miPrimerLoro.getNombre());
        System.out.println("Su color es : " + miPrimerLoro.getColor());
        System.out.println("Tiene " + miPrimerLoro.getEdad());
        
        System.out.println("Mi otro loro se llama " + segundoLoro.getNombre());
        System.out.println("Su color es " + segundoLoro.getColor());
        System.out.println("Tiene " + segundoLoro.getEdad());
        
        System.out.println("Introduce un nombre para el loro 3: " );
        tercerLoro.setNombre(sc.nextLine());
        System.out.println("El nombre del loro 3 es: " + tercerLoro.getNombre());
        
    
    }
    
}