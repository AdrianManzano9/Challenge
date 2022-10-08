/*
 1. Pide un número por teclado e indica si es un número primo o no. Un número primo es
aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package ModuloAlgoritmos;

import java.util.Scanner;

public class Uno {

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer numero = leer.nextInt();
        boolean primo = false;
        int i = 2;
        while (i < numero) {
            if (numero % i == 0) {
                System.out.print("No es primo");
                return;
            }
            i++;
        }
        System.out.print("Es primo");
    }
}
