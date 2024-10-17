
package test;

import datos.Calificacion;
import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {
        ArrayList<Calificacion> lista  
                = new ArrayList<>();
        
        Calificacion dato = new Calificacion
                    ("A1", "Matematicas", 1, 100); 
        Calificacion dato2 = new Calificacion
                    ("A2", "Programacion", 1, 100);
        lista.add(dato); 
        lista.add(dato2); 
        
        //lista.remove(1);
        int cantidadDatos = lista.size(); 
        for(int i=0;i<cantidadDatos;i++){
            System.out.println(lista.get(i));
        }
    }
    
}
