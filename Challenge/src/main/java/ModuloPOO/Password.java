/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloPOO;

/**
 *
 * @author NTBK
 */
public class Password {

    private int longitud = 8;
    private String contraseña;

    public Password() {
    }

    public Password(int i) {
        this.longitud = i;
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        this.contraseña = "";
        for (int j = 0; j < longitud; j++) {
            int random = (int) (Math.random() * (chars.length() - 1));
            this.contraseña = contraseña.concat(chars.substring(random, random + 1));
        }
    }

    public boolean esFuerte() {
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = "abcdefghijklmnopqrstuvwxyz";
        int nMay = 0, nMin = 0, n = 0;
        for (int i = 0; i < contraseña.length(); i++) {

            if ((may.contains(contraseña.substring(i, i + 1)))) {
                nMay++;
            }
            if ((min.contains(contraseña.substring(i, i + 1)))) {
                nMin++;
            }
            for (Integer j = 0; j < 10; j++) {
                if (contraseña.substring(i, i + 1).equals(j.toString())) {
                    n++;
                }
            }
        }
        if (nMay > 2 & nMin > 1 & n > 3) {
            return true;
        } else {
            return false;
        }
    }

    public void generarPassword() {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        this.contraseña = "";
        for (int j = 0; j < longitud; j++) {
            int random = (int) (Math.random() * (chars.length() - 1));
            this.contraseña = contraseña.concat(chars.substring(random, random + 1));
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
