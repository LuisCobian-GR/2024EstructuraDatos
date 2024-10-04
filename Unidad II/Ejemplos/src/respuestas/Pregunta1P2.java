package respuestas;

/**
 *  Definiendo la funcion que resultado da si mandamos un 5
 * @author coby_
 */
public class Pregunta1P2 {
    
    public static void main(String[] args) {
        System.out.println(obtenerNumeroSecreto(5));
    }
    
    public static int obtenerNumeroSecreto(int n){
        if(n == 0) return 0;
        else return n + obtenerNumeroSecreto(n-1); 
    }
    
}
