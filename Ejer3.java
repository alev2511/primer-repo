
import java.util.Scanner;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 */

/**
 *
 * @author EQUIPO
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("Tu frase en minisculas");
        System.out.println (frase.toLowerCase());
        System.out.println("Tu frase en MAYUSCULAS");
        System.out.println(frase.toUpperCase());
       
        
   
    }
    
}
