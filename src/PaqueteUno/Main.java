package PaqueteUno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String... args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader((System.in)));
        Cifrar ob1 = new Cifrar();
        Decifrar ob2 = new Decifrar();
        
        String cadena;
        String entrada;
        String x;
        String x1;
        int n;
        
        cadena = bufer.readLine();
        n = Integer.parseInt(entrada = bufer.readLine());
        
        x = ob1.cifrar(cadena, n);
        System.out.println(x);
        x1 = ob2.decifrar(x, n);
        System.out.println(x1);
    }
    
    

}
