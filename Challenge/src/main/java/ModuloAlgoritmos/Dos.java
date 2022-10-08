/*
2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
presione una tecla, luego de esto se cerrará el programa.
 */
package ModuloAlgoritmos;

import java.util.Scanner;

public class Dos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int limit = 3;
        System.out.println("Ingrese una contraseña");
        String contr = leer.next();
        for (int i = 1; i <= limit; i++) {
            System.out.println("Ingresa tu contraseña");
            String inten = leer.next();
            if (inten.equals(contr)) {
                System.out.println("Felicitaciones, recordás tu contraseña");
                return;
            } else {
                System.out.println("Contraseña incorrecta \n"+"Intentos restantes: "+(limit-i));
                
            }
        }
        System.out.println("Tenes que ejercitar la memoria");
    }
}
