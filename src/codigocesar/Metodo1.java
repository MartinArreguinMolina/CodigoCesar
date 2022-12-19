
package codigocesar;

public class Metodo1 {
    char x;
    int pos;
    String cadena1 = "";
    
    public String Metodo1(String cadena, String letras, int n){
        cadena = cadena.toUpperCase();
        
        for(int i = 0; i < cadena.length(); i++){
            x = cadena.charAt(i);
            
            pos = letras.indexOf(x);
            
            if(pos == -1){
                cadena1 += x;
            }else{
                cadena1 += letras.charAt((pos + n) % letras.length());
            }
        }
        
        return cadena1;
    }
    
}
