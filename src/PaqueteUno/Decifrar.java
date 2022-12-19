package PaqueteUno;

public class Decifrar {

    public String decifrar(String cadena, int n) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char x;
        int pos;
        String cadenaNueva = "";
        
        cadena = cadena.toUpperCase();
        n %= 26;
        
        for (int i = 0; i < cadena.length(); i++) {
            x = cadena.charAt(i);
            pos = letras.indexOf(x);

            if (pos == -1) {
                cadenaNueva += x;
            } else if (pos - n < 0) {
                cadenaNueva += letras.charAt(letras.length() + (pos - n));
            } else {
                cadenaNueva += letras.charAt((pos - n));
            }
        }

        return cadenaNueva;
    }

}
