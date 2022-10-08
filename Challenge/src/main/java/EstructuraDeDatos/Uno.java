/*
1)Implementar una función que recibe una lista de enteros L y un número entero n de forma
que modifique la lista mediante el borrado de todos los elementos de la lista que tengan este
valor
 */
package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Uno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> L = new ArrayList<>();
        int num;
        String res;
        do {
            System.out.print("Ingresar entero a listar: ");
            num = leer.nextInt();
            L.add(num);
            System.out.println("¿Qiere ingresar otro entero? (s/n)");
            res = leer.next();
        } while (res.equalsIgnoreCase("s"));
        System.out.print("Lista: ");
        for (Integer i : L) {
            System.out.print(i + " ");
        }
        do {
            System.out.print("\nIngresar entero a borrar: ");
            num = leer.nextInt();
            for (Iterator<Integer> iterator = L.iterator(); iterator.hasNext();) {
                Integer next = iterator.next();
                if (next.equals(num)) {
                    iterator.remove();
                }
            }
            for (Integer i : L) {
                System.out.print(i + " ");
            }
            System.out.println("\n¿Qiere borrar otro entero? (s/n)");
            res = leer.next();
        } while (res.equalsIgnoreCase("s"));

    }

}
