/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */

import java.util.Scanner;

public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los Grados Centígrados(°C): ");
        int C= leer.nextInt();
        int F= 32 + (9*C/5);
        System.out.println("El valor en Grados Fahrenheit(°F) es: ");
        System.out.println(F);
        
        
    }
    
}
