/*
3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.
 */
package ModuloAlgoritmos;

import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresar el valor por hora: $");
        double valorHora = leer.nextDouble();
        System.out.print("Ingresar el nombre del empleado: ");
        String nombre = leer.next();
        System.out.print("Ingresar los años completos de antiguedad: ");
        int antig = leer.nextInt();
        System.out.print("Ingresar la cantidad de horas completas trabajadas en el mes: ");
        int horas = leer.nextInt();
        double importe = valorHora * horas;
        if (antig > 10) {
            importe += antig * 30;
        }
        System.out.println(" Nombre: " + nombre + "\n Antiguedad: " + antig + " años \n Total a cobrar: " + importe);

    }

}
