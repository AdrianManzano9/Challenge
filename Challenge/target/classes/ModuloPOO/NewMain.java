
package ModuloPOO;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Password p = new Password();
        System.out.print("Ingrese una contraseña: ");
        p.setContraseña(leer.next());
        if (p.esFuerte()) {
            System.out.println("La contraseña es fuerte");
        }else{
            System.out.println("La contraseña no es fuete");
        }
        
    }
    
}
