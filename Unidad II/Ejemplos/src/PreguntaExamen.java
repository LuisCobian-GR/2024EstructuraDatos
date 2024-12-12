


/**
 *
 * @author coby_
 */
public class PreguntaExamen {
    public static void main(String[] args) {
        System.out.println(obtenerNumeroSecreto(5));
    }
    
    public static int obtenerNumeroSecreto (int n) { 
       if(n==0) return 0; 
       else return n + obtenerNumeroSecreto(n-1);
    }
}
