package datos;

import java.util.ArrayList;

/**
 * Sirve para poder simular una base de datos 
 * @author coby_
 */
public class ServicioDatos {
    
    public static Calificacion[] kardex = new Calificacion[10]; 
    public static int index = 0; 
    /// Implementando listas 
    public static ArrayList<Calificacion> listCalificaciones = 
            new ArrayList<>(); 
}
