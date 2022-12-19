
package codigocesar;


public class Metodo2 {
    int pos;
    char x;
    String cadena2 = "";
    public String Metodo2(String cadena , String letras , int n){
        cadena = cadena.toUpperCase();
        
        for(int i = 0; i < cadena.length(); i++){
            x = cadena.charAt(i);
            
            pos = letras.indexOf(x);
            
            if(pos == -1){
                cadena2 += x;
            }else if(pos - n < 0){
                cadena2 += letras.charAt(letras.length() + (pos - n));
            }else{
                cadena2 += letras.charAt((pos - n) % letras.length());
            }
        }
        return cadena2;
    }
}
