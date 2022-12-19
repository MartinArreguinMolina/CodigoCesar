package PaqueteUno;

public class Cifrar {

    public String cifrar(String cadena, int n) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nuevaCadena = "";
        char x;
        int pos;

        cadena = cadena.toUpperCase();

        for (int i = 0; i < cadena.length(); i++) {
            x = cadena.charAt(i);
            pos = letras.indexOf(x);

            if (pos == -1) {
                nuevaCadena += x;
            } else {
                nuevaCadena += letras.charAt((pos + n) % letras.length());
            }

        }

        return nuevaCadena;
    }

}
