
package examen;

public class Pregunta6 {
    
    public static void main(String[] args) {
        int num = obtenerNumeroSecreto(5);
        System.out.println("El valor es " + num);
    }
    
    
    private static int obtenerNumeroSecreto(int n){
        if (n==0) return 0; 
        else return n + obtenerNumeroSecreto(n-1); 
    }
    
}
