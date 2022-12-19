package codigocesar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CodigoCesar {

    //Bufer
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    static String entrada;
    //String
    static String cadena;
    static String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    //Int
    static int n;
    //Objetos
    static Metodo1 ob1 = new Metodo1();
    static Metodo2 ob2 = new Metodo2();
    
    public static void main(String[] args) throws IOException {
        Menu();
        
        System.out.println("La cadena encriptada es : " + ob1.Metodo1(cadena, letras, n));
        System.out.println("La cadena decifrada es : " + ob2.Metodo2(ob1.cadena1, letras, n));
    }

    public static void Menu() throws IOException {
        System.out.print("Dame la cadena que deseas encriptar : ");
        cadena = bufer.readLine();

        try {
            System.out.print("Cuantos espacios deseas encriptar tu cadena : ");
            entrada = bufer.readLine();
            n = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("---------------------------------------------------");
            System.out.println("Debes de digitar un numero intanta de nuevo . . . .");
            System.out.println("---------------------------------------------------");
        }
    }

}
