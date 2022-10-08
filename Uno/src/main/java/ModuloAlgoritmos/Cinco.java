/*
5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
caso se terminará el programa.
Al terminar, mostrará lo siguiente:
a. – mayor número introducido
b. – menor número introducido
c. – suma de todos los números
d. – suma de los números
 */
package ModuloAlgoritmos;

import java.util.Scanner;

public class Cinco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num==-1) {
            System.out.println("No se ha ingresado ningun numero");
        }
        int mayor = num, menor = num, total = num;
        System.out.println("Ingrese otro numero");
        num = leer.nextInt();
        while (num != -1) {
            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
            total += num;
            System.out.println("Ingrese otro numero");
            num = leer.nextInt();
        }
        System.out.println("Mayor número introducido: " + mayor
                + "\nMenor número introducido: " + menor
                + "\nSuma de todos los números: " + total
                + "\nSuma de los números: " + (mayor + menor + total));
    }

}
