/*
4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
número comprendido entre 0 y 1000. Se compara el número introducido con el
calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
función del caso. Se repite la operación hasta que el usuario encuentra el número.
 */
package ModuloAlgoritmos;

import java.util.Scanner;


public class Cuatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = (int) (Math.random()*999)+1;
        System.out.println(num);
        System.out.print("Adivine el numero entre 0 y 1000: ");
        int adv = leer.nextInt();
        int i = 1;
        while (num != adv) {            
            if(adv<num){
                System.out.println("es mayor");
            } else {
                System.out.println("es menor");
            }
            System.out.print("Prueba otra vez: ");
            adv = leer.nextInt();
            i++;
        }
        System.out.println("Correcto\nNumero de intentos: "+i);
    }
    
}
