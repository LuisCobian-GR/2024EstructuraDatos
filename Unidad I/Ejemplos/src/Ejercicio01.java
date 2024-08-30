
import java.util.Arrays;

/**
 * Probando arreglos unidimensionales
 * @author coby_
 * 27 - Ago 
 */
public class Ejercicio01 {
    
    //psvm + tab
    public static void main(String[] args) {
        //variable tipodato nombre = asignacion 
        int x[] = {20,5,32,8,5,26,32,5,6,7}; 
        int suma = x[3] + x[8]; 
        System.out.println("El resultado de la suma es " + suma);
        x[5] = 0; 
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i]);         
        }
        System.out.println("");
        /// intercambio 
        int aux = x[0]; 
        x[0] = x[7]; 
        x[7] = aux; 
        int acumulador = 0; 
        for (int valor : x) {
            System.out.print(" " + valor);
            acumulador += valor; 
        }
        System.out.println("");
        System.out.println("La suma de la lista es " + acumulador);
        
        Arrays.sort(x);
        
        
        System.out.println(Arrays.toString(x));
        
    } // main
} // clases
