
package RespuestaExamen;

/**
 * Teniendo el siguiente arreglo obtener de un conjunto de valores
 * El valor mayor o menor 
 * @author coby_
 */
public class PreguntaExamen {
    
    public static void main(String[] args) {
        int arreglo[] = {10,3,12,6,7,3,2,10,7,8,3,-3,-8,10}; 
        int menor = arreglo[0]; 
        int posicion = 0; 
        for(int i = 1; i< arreglo.length; i++){
            if(menor>arreglo[i])
            {
                menor = arreglo[i];
                posicion = i; 
            } // if 
        } // for 
        System.out.println(menor);
        System.out.println("Que el numero menor esta en " + posicion);
    } // main
} // class
