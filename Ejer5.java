/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

import java.util.Scanner;
      
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        double num = leer.nextInt();
        double doble = num*2;
        double triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble de éste número es: ");
        System.out.println(doble);
        System.out.println("El triple de éste número es: ");
        System.out.println(triple);
        System.out.println("La raiz cuadrada de éste número es: ");
        System.out.println(raiz);
        
    }
    
}
